DROP TABLE entity IF EXISTS;


CREATE TABLE entity ( id INTEGER IDENTITY PRIMARY KEY, name VARCHAR(30), family VARCHAR(30) );

INSERT INTO entity VALUES (1, 'Jack', 'Tom');
INSERT INTO entity VALUES (2, 'Mike', 'Lee');
INSERT INTO entity VALUES (3, 'foo', 'bar');


