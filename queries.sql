-- All female customers' names (only one column).

SELECT (name) FROM customers WHERE gender == 'Female';

-- Total amount of money spent by all customers (single number).

SELECT SUM(net_value * (1 + tax_rate / 100.0)) FROM sales;

-- All customers older than 18 years (whole rows).

SELECT * FROM customers WHERE strftime('%Y', 'now') - birthyear > 18;

-- All customers sorted by their surname (whole rows).

SELECT * FROM customers ORDER BY surname;

-- All products' names which contain letter "a" in their name (whole rows).

SELECT * FROM sales WHERE product_name LIKE '%a%';

-- Details of sales which have net value grater than 500 (whole rows).

SELECT * FROM sales WHERE net_value > 500;

-- Total number of customers (single number).

SELECT COUNT(*) FROM customers;

-- Total number of sales (single number).

SELECT COUNT(*) FROM sales;

-- Total spending of customer with id: 7 (single number).

SELECT SUM(net_value * (1 + tax_rate / 100.0)) FROM sales WHERE customer_id == 7;

-- Customers' names and their total spending (customer name | total spending).

SELECT customers.name, SUM(sales.net_value) AS total_spending FROM customers
JOIN sales ON customers.id = sales.customer_id
GROUP BY customers.name;