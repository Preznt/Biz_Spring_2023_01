
USE mydb;

DESC tbl_books;

CREATE DATABASE mydb;
USE mydb;
DROP TABLE tbl_contact;


CREATE TABLE tbl_contact (
	c_uid varchar(256) NOT NULL,
	c_name varchar(125),
	c_tel  varchar(30),
	c_addr  varchar(125),
	c_hobby  varchar(125)
);

INSERT INTO tbl_contact (
	c_uid, c_name, c_tel, c_addr, c_hobby
)VALUES(
'123455648', '이름', '010-1324-4564','광주광역시','골프'
);

SELECT * FROM tbl_contact;

