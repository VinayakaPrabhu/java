----------TEST TABLE AND DATA

create table test ( testid char(5), testname char(10));
insert test values ('1', 'test1');
insert test values ('2', 'test2');
insert test values ('3', 'test3');
select * from test;
go

--CREATE A VIEW
create view vwtest as
select * from test;
go
--SELECT FROM VIEW 
select * from vwtest;
--PERFORM DDL WITH VIEW
delete from vwtest;

------------------------------------------------------------
create table test1 ( testid char(5), testname char(10), testtype char(10));
truncate table test1;
insert test1 values ('1', 'test','t1');
insert test1 values ('2', 'test', 't1');
insert test1 values ('3', 'test','t3');
select *from test1;

create view vwtest1 as
select * from test1 where testtype = 't1';

select * from vwtest1;
--ONLY RECORDS SATISFYING THE QUERY IN THE VIEW WILL BE UPDATED
update vwtest1 set testname = 'updated' where testname = 'test'
select *from vwtest1;
select * from test1;

go
----------------------------------------

USE AdventureWorksDW2012 ;   
GO  

--SIMPLE SYNTAX
CREATE VIEW VIEWNAME
AS
QUERY

--DROPPING THE VIEW
DROP VIEW VIEWNAME
RECREATE IT

-- ALTER VIEW SYNTAX
CREATE OR ALTER VIEW VIEWNAME

--SIMPLE VIEW
CREATE OR ALTER VIEW DimEmployeeBirthDates AS  
SELECT FirstName, LastName, BirthDate   
FROM DimEmployee;  

SELECT * FROM DIMEMPLOYEE;
SELECT * FROM DimEmployeeBirthDates;

USE AdventureWorks2012 ;   
GO 
--CREATE VIEW WITH JOIN
CREATE OR ALTER VIEW HumanResources.EmployeeHireDate  
AS  
SELECT p.FirstName, p.LastName, e.HireDate  
FROM HumanResources.Employee AS e JOIN Person.Person AS  p  
ON e.BusinessEntityID = p.BusinessEntityID ;   
GO  
-- Query the view  
SELECT FirstName, LastName, HireDate  
FROM HumanResources.EmployeeHireDate  
ORDER BY LastName; 

--TRY ACCESSING A COLUMN NOT IN THE VIEW
SELECT * FROM PERSON.PERSON;
SELECT FirstName, LastName, HireDate, PersonType  
FROM HumanResources.EmployeeHireDate  
ORDER BY LastName; 

--CREATE VIEW WITH MULTIPLE JOINS
CREATE OR ALTER VIEW dbo.SeattleOnly  
AS  
SELECT p.LastName, p.FirstName, e.JobTitle, a.City, sp.StateProvinceCode  
FROM HumanResources.Employee e  
INNER JOIN Person.Person p  
ON p.BusinessEntityID = e.BusinessEntityID  
    INNER JOIN Person.BusinessEntityAddress bea   
    ON bea.BusinessEntityID = e.BusinessEntityID   
    INNER JOIN Person.Address a   
    ON a.AddressID = bea.AddressID  
    INNER JOIN Person.StateProvince sp   
    ON sp.StateProvinceID = a.StateProvinceID  
--WHERE a.City = 'Seattle'  
GO  

SELECT * FROM SeattleOnly;
SELECT * FROM SeattleOnly where FirstName = 'Jack'
--Using built-in functions within a view
update SeattleOnly set FirstName = 'Jelly' where FirstName = 'Jill';
SELECT * FROM SeattleOnly where FirstName = 'Jill'
select * from Person.Person where FirstName = 'Jill'


CREATE OR ALTER VIEW Sales.SalesPersonPerform  
AS  
SELECT TOP (100) SalesPersonID, SUM(TotalDue) AS TotalSales  
FROM Sales.SalesOrderHeader  
WHERE OrderDate > CONVERT(DATETIME,'20001231',101)  
GROUP BY SalesPersonID;  
GO  


--UPDATE AND DELETE THROUGH VIEWS
use demo;
CREATE TABLE Sales ( Country varchar(50), Region varchar(50), Sales int );
SELECT * FROM SALES;
TRUNCATE TABLE SALES;
INSERT INTO sales VALUES (N'Canada', N'Alberta', 100);
INSERT INTO sales VALUES (N'Canada', N'British Columbia', 200);
INSERT INTO sales VALUES (N'Canada', N'British Columbia', 300);
INSERT INTO sales VALUES (N'United States', N'Montana', 100);
SELECT * FROM SALES;

CREATE VIEW VW_SALES
AS
SELECT COUNTRY, REGION FROM SALES
GO
INSERT INTO VW_SALES VALUES('INDIA','SOUTH');
SELECT * FROM SALES;
UPDATE VW_SALES SET REGION = 'NORTH' WHERE COUNTRY = 'INDIA'
SELECT * FROM VW_SALES;
DELETE FROM VW_SALES WHERE COUNTRY = 'INDIA'
--SYSTEM CATALOG
SELECT * FROM SYS.VIEWS;
SELECT * FROM SYS.TABLES;
USE DEMO;

------------------------------
--CREATING SYNONYMS

SELECT * FROM [HumanResources].[EmployeePayHistory]
CREATE SYNONYM PAY FOR [HumanResources].[EmployeePayHistory]
CREATE SYNONYM PAY1 FOR [HumanResources].[EmployeePayHistory]
SELECT * FROM PAY;
SELECT * FROM PAY1;

--SYNONYM FOR VIEWS.
CREATE SYNONYM SO FOR dbo.SeattleOnly 
SELECT * FROM SO;

-- FETCH METADATA
SELECT * FROM SYS.VIEWS;
SELECT NAME,CREATE_DATE FROM SYS.VIEWS;
SELECT * FROM SYS.TABLES;
SELECT NAME,CREATE_DATE FROM SYS.TABLES;
SELECT * FROM SYS.TRIGGERS;
SELECT * FROM SYS.TABLES WHERE NAME='SHIFT'
SELECT * FROM SYS.OBJECTS WHERE TYPE = 'U';
 