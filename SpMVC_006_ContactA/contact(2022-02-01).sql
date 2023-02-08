
USE mydb;

DESC tbl_books;

CREATE DATABASE mydb;
USE mydb;
DROP TABLE tbl_contact;


CREATE TABLE tbl_contact (
	c_uid	BIGINT	AUTO_INCREMENT	PRIMARY KEY,
c_name	VARCHAR(20)	NOT NULL	,
c_tel	VARCHAR(15)	NOT NULL	,
c_addr	VARCHAR(125)	,
c_hobby	VARCHAR(20)
	
);

CREATE TABLE tbl_hobbies (
h_uid	BIGINT	AUTO_INCREMENT	PRIMARY KEY,
h_cuid	BIGINT	NOT NULL	,
h_name	VARCHAR(15)	NOT NULL	

);

DROP TABLE tbl_contact;
DROP TABLE tbl_hobbies;

INSERT INTO tbl_contact (
	c_uid, c_name, c_tel, c_addr, c_hobby
)VALUES(
'123455648', '이름', '010-1324-4564','광주광역시','골프'
);

SELECT * FROM tbl_contact;

