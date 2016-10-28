CREATE SEQUENCE student_group_sequence
MINVALUE 1
MAXVALUE 9223372036854775808
START WITH 9223372036854775808
INCREMENT BY -1
CACHE 100;

CREATE table student_group (
  first_name	VARCHAR(100),
  last_name 	VARCHAR(100),
  group_id	INT
);

INSERT INTO student_group VALUES (first_name, last_name, group_id)
VALUES ('Robert', 'Plant', 411),
  VALUES ('Jimmy', 'Page', 412),
  VALUES ('Jimmy', 'Morrison', 413),
  VALUES ('John', 'Lennon', 414),
  VALUES ('George', 'Harrison', 415),
  VALUES ('John', 'Lord', 416),
  VALUES ('Syd', 'Barret', 417),
  VALUES ('Ian', 'Gillan', 418),
  VALUES ('Jack', 'White', 419);