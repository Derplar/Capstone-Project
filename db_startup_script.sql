create database javaTestDB;
use javaTestDB;

CREATE TABLE TEST_TABLE (
		id INT NOT NULL AUTO_INCREMENT, 
		TEXT VARCHAR(400) NOT NULL,
		PRIMARY KEY (ID)
	);

INSERT INTO TEST_TABLE values (default, 'By fire be purged');