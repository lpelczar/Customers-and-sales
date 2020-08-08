# Customers and sales

## Description

Create an SQLite database based on given ERD diagram. 

Save database creation script to create_db.sql file. Remember that *.sql files may contain only SQL queries and comments.

Fill your database with data from given .csv files: customers.csvWyświetl podgląd dokumentu, sales.csv Save insertion script to insert_sample_data.sql file.
Write queries that will return:
- All female customers' names (only one column). 
- Total amount of money spent by all customers (single number).
- All customers older than 18 years (whole rows).
- All customers sorted by their surname (whole rows).
- All products' names which contain letter "a" in their name (whole rows). 
- Details of sales which have net value grater than 500 (whole rows).
- Total number of customers (single number).
- Total number of sales (single number).
- Total spending of customer with id: 7 (single number).
- (optional) Customers' names and their total spendings (customer name | total spending).

In this part we would like to see if you are able to interact with a database in java. 

Create a java application with advanced search feature which will allow user to search through the whole database. Advanced search feature should:

- Search through all the tables, columns and records in the database.
- Be case insensitive.
- Be able to match parts of words. Search phrase "og" should match "Roger" and "Ogre".
- Use maven to manage dependencies for this project.
- Instead of using scanner to grab the search phrase it might be passed as a CLI argument e.g: java Search "Search Phrase"

## More info

Project made for [Codecool](https://codecool.com/) programming course.
