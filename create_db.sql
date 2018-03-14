CREATE TABLE customers (
  id INTEGER PRIMARY KEY,
  name TEXT,
  surname TEXT,
  birthyear INTEGER,
  gender TEXT
);

CREATE TABLE sales (
  id INTEGER ,
  customer_id INTEGER,
  product_name TEXT,
  net_value REAL,
  tax_rate INTEGER,
  FOREIGN KEY (customer_id) REFERENCES customers(id)
);