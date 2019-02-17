\c test_development;

CREATE SEQUENCE users_id_seq;

CREATE TABLE users (
  id int PRIMARY KEY DEFAULT nextval('users_id_seq'),
  name VARCHAR(255) NOT NULL,
  age int NOT NULL
);

INSERT INTO users (name, age) VALUES
  ('kim', 35),
  ('trump', 72),
  ('maduro', 56),
  ('Duterte', 73)
 ;
