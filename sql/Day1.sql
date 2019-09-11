CREATE DATABASE CASINO

USE CASINO;

CREATE TABLE TEST
(
ID INT, 
DUMMY CHAR(10)
)

INSERT into TEST (id,dummy) VALUES(2,'');
INSERT TEST (id,dummy) VALUES(3,'c e');
select * from test;
select *from test;
select * from dbo.test;
select * from casino.dbo.test;
select len(dummy)from test;
select dummy + ':' + dummy from test;

select dummy, len(dummy) from test;

CREATE TABLE CASINO.dbo.TEST1(ID INT, DUMMY CHAR(10))
CREATE TABLE dbo.TEST2(ID INT, DUMMY CHAR(10))

https://docs.microsoft.com/en-us/sql/t-sql/statements/create-table-transact-sql?view=sql-server-2017


ALTER TABLE TEST2
ALTER COLUMN DUMMY VARCHAR(30) ;

select * from test2;
INSERT INTO TEST2 VALUES(6, NULL);
INSERT INTO TEST2 VALUES(5, 'NULL');
SELECT DUMMY+DUMMY FROM TEST2 WHERE DUMMY = 'NULL'
SELECT DUMMY+DUMMY FROM TEST2;
SELECT * FROM TEST2 WHERE DUMMY IS NULL;
SELECT * FROM TEST2 WHERE DUMMY = 'null';

select * from employee;
CREATE TABLE EMPLOYEE(ID INT, EMPNAME CHAR(10));
delete  EMPLOYEE;
INSERT INTO EMPLOYEE VALUES (1, 'HARI');
INSERT INTO EMPLOYEE VALUES (2, 'HARI');

alter table employee
add  city varchar(10) unique;
INSERT INTO EMPLOYEE VALUES (1, 'HARI', null);
INSERT INTO EMPLOYEE VALUES (2, 'mary', 'bell');
INSERT INTO EMPLOYEE VALUES (2, 'larry', 'bell');
select * from employee;

alter table employee
drop constraint UQ__EMPLOYEE__23BEBA6A0A99FAF4

INSERT INTO EMPLOYEE VALUES (2, 'HARI','Chennai');
--Violation of UNIQUE KEY constraint 'UQ__EMPLOYEE__23BEBA6A444A07D1'. 
--Cannot insert duplicate key in object 'dbo.EMPLOYEE'. The duplicate key value is (Chennai).

--Cannot insert the value NULL into column 'DUMMY', table 'CASINO.dbo.TEST2'; 
--column does not allow nulls. INSERT fails.
delete employee;
alter table employee
drop column city;

alter table employee
add  city varchar(10) CONSTRAINT unqCity unique

--alter table employee
--alter column city varchar(10) CONSTRAINT unqCity unique

alter table employee
add constraint unqCity unique (city)

delete from employee where id=2

--CREATING A CONSTRAINT WHILE CREATING A TABLE
CREATE TABLE EMPLOYEE1(ID INT, EMPNAME CHAR(10) UNIQUE);
CREATE TABLE EMPLOYEE2(ID INT, EMPNAME CHAR(10) CONSTRAINT unqEmpName UNIQUE);
alter table employee2
add city char(10) unique

sp_helpconstraint employee;

truncate table employee;

alter table employee
add state char(10) unique


CREATE TABLE EMPLOYEE3(ID INT primary key, EMPNAME CHAR(10));
INSERT INTO EMPLOYEE3 VALUES (1, 'HARI');
INSERT INTO EMPLOYEE3 VALUES (2, 'HARI');
INSERT INTO EMPLOYEE3 VALUES (4, null);
INSERT INTO EMPLOYEE3 VALUES (null, 'HARI');
INSERT INTO EMPLOYEE3 VALUES (4, 'HARI');
select * from employee3 where id = 2;
update employee3 set empname='jumbo' where id=2;
select *from employee3;
delete from employee3 where empname is null;
alter table  employee3
add unique(empname)

