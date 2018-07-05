
create table student (
id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
age int(11) NOT NULL, 
name varchar(255)DEFAULT NULL
);

insert into student values(100,20,'Thomas');
insert into student values(200,21,'Jason');
insert into student values(300,22,'Mayla');
insert into student values(400,23,'Nisha');
insert into student values(500,24,'Randy');

DROP TABLE student;

SELECT * FROM student;