package com.codecool.verysimpleshop.data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PreparedStatementCreator extends DbHelper {

    public PreparedStatement getPreparedStatementBy(List args, String sqlStatement) {
        PreparedStatement statement = null;
        try {
            statement = getPreparedStatement(sqlStatement);
            if (!args.isEmpty()) {
                int index = 1;
                for (Object argument : args) {
                    statement.setObject(index, argument);
                    index++;
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return statement;
    }
}
