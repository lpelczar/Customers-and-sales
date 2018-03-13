CREATE TABLE customers (
  id INTEGER PRIMARY KEY,
  name TEXT,
  surname TEXT,
  birthyear TEXT,
  gender TEXT
);

CREATE TABLE sales (
  id INTEGER ,
  customer_id INTEGER,
  product_name TEXT,
  net_value TEXT,
  tax_rate TEXT,
  FOREIGN KEY (customer_id) REFERENCES customers(id)
);