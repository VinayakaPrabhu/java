---- SETUP SAMPLE DATABASES--------------.
https://docs.microsoft.com/en-us/sql/samples/adventureworks-install-configure?view=sql-server-2017

----------QUERIES-------------

--https://docs.microsoft.com/en-us/sql/t-sql/queries/queries?view=sql-server-2017

--SELECT select_list [ INTO new_table ]

--[ FROM table_source ] [ WHERE search_condition ]

--[ GROUP BY group_by_expression ]

--[ HAVING search_condition ]

--[ ORDER BY order_expression [ ASC | DESC ] ]

SELECT GETDATE()
SELECT @@VERSION
SELECT GETDATE(), @@VERSION;

USE AdventureWorksDW2012;
SELECT * FROM DimEmployee
ORDER BY FIRSTNAME;

SELECT FIRSTNAME FROM DimEmployee
ORDER BY FIRSTNAME desc;

SELECT DimEmployee.FIRSTNAME FROM DimEmployee
ORDER BY FIRSTNAME;
--using table alias
SELECT e.FIRSTNAME FROM DimEmployee AS E
ORDER BY FIRSTNAME;

--user-defined column heading
SELECT DimEmployee.FIRSTNAME AS 'EMPLOYEE-FIRST-NAME' FROM DimEmployee
ORDER BY FIRSTNAME;

SELECT FirstName, LastName, StartDate AS FirstDay, MaritalStatus,EndDate
FROM DimEmployee   
WHERE EndDate IS NOT NULL   
AND MaritalStatus = 'M'  
ORDER BY LastName;  


SELECT FirstName, LastName, StartDate AS FirstDay, MaritalStatus,EndDate
FROM DimEmployee   
WHERE EndDate IS  NULL   
AND MaritalStatus != 'M'  
ORDER BY LastName;  

SELECT  BaseRate, BaseRate * 40 AS GrossPay  
FROM DimEmployee  
ORDER BY LastName;  

SELECT  BaseRate, BaseRate * 40 as 'CALCULATED BASE RATE'  
FROM DimEmployee  
ORDER BY LastName;  

SELECT  Title  
FROM DimEmployee  
ORDER BY Title; 

SELECT DISTINCT Title  
FROM DimEmployee  
ORDER BY Title; 

SELECT COUNT(*) FROM FactInternetSales;
SELECT  SUM(SalesAmount) ,MIN(SalesAmount), MAX(SalesAmount)
FROM FactInternetSales  
--ORDERDATEKEY IS NON AGGREGATE, SALESAMOUNT IS AGGREGATE 
SELECT OrderDateKey, SUM(SalesAmount) 
FROM FactInternetSales  
GROUP BY OrderDateKey
--'FactInternetSales.OrderDateKey' is invalid in the select list because it is not contained
-- in either an aggregate function or the GROUP BY clause.

SELECT PRODUCTKEY, OrderDateKey, SUM(SALESAMOUNT) FROM FactInternetSales
GROUP BY PRODUCTKEY,OrderDateKey    
SELECT OrderDateKey, SUM(SalesAmount) 
FROM FactInternetSales  
GROUP BY OrderDateKey;

--SELECT GENDER,TOTALCHILDREN FROM DIMCUSTOMER WHERE GENDER='M'
SELECT GENDER, TOTALCHILDREN FROM DIMCUSTOMER;
SELECT GENDER, SUM(TOTALCHILDREN) FROM DIMCUSTOMER
GROUP BY GENDER;

SELECT GENDER, MARITALSTATUS, SUM(TOTALCHILDREN) FROM DIMCUSTOMER
GROUP BY GENDER,MARITALSTATUS

SELECT GENDER, MARITALSTATUS, SUM(TOTALCHILDREN) AS 'TOTAL CHILDREN' FROM DIMCUSTOMER
WHERE TOTALCHILDREN = 2
GROUP BY GENDER,MARITALSTATUS


SELECT GENDER, MARITALSTATUS, SUM(TOTALCHILDREN) FROM DIMCUSTOMER
WHERE TOTALCHILDREN = 2
GROUP BY GENDER,MARITALSTATUS
ORDER BY GENDER ASC
SELECT COUNT(*) FROM DIMCUSTOMER;

SELECT GENDER, MARITALSTATUS, SUM(TOTALCHILDREN) FROM DIMCUSTOMER
WHERE TOTALCHILDREN = 2
GROUP BY GENDER,MARITALSTATUS
ORDER BY GENDER ASC, MARITALSTATUS ASC

SELECT GENDER, MARITALSTATUS, SUM(TOTALCHILDREN) FROM DIMCUSTOMER
WHERE TOTALCHILDREN = 2
GROUP BY GENDER,MARITALSTATUS
ORDER BY GENDER, MARITALSTATUS DESC

SELECT GENDER, MARITALSTATUS, SUM(TOTALCHILDREN) FROM DIMCUSTOMER
WHERE TOTALCHILDREN = 2
GROUP BY GENDER,MARITALSTATUS
HAVING SUM(TOTALCHILDREN) > 1800
ORDER BY GENDER, MARITALSTATUS DESC

use demo;
CREATE TABLE Sales ( Country varchar(50), Region varchar(50), Sales int );
SELECT * FROM SALES;
TRUNCATE TABLE SALES;
INSERT INTO sales VALUES (N'Canada', N'Alberta', 100);
INSERT INTO sales VALUES (N'Canada', N'British Columbia', 200);
INSERT INTO sales VALUES (N'Canada', N'British Columbia', 300);
INSERT INTO sales VALUES (N'United States', N'Montana', 100);
SELECT * FROM SALES;

SELECT Country, Region, SUM(sales) AS TotalSales
FROM Sales
GROUP BY Country, Region;

SELECT Country, Region, SUM(Sales) AS TotalSales
FROM Sales
GROUP BY ROLLUP (Country, Region);

SELECT Country, Region, SUM(Sales) AS TotalSales
FROM Sales
GROUP BY CUBE (Country, Region);

SELECT Country, Region, SUM(Sales) AS TotalSales
FROM Sales
GROUP BY GROUPING SETS ( ROLLUP (Country, Region), CUBE (Country, Region) );

select getdate();
select * from Sales;

select * from 
(SELECT row_number() OVER (order by getdate()) as ROWID, * FROM Sales) temp
where ROWID = 3;

--DDL CREATE, ALTER, DROP, TRUNCATE
drop table DailyIncome
TRUNCATE TABLE DAILYINCOME WHERE VENDORID = 'SPIKE'
SELECT *FROM DAILYINCOME
USE DEMO;

TRUNCATE TABLE DAILYINCOME;
BEGIN TRAN
--DELETE FROM DAILYINCOME;

ROLLBACK TRAN
SELECT *FROM DAILYINCOME

insert into DailyIncome values ('SPIKE', 'FRI', 100)
insert into DailyIncome values ('SPIKE', 'MON', 300)
insert into DailyIncome values ('FREDS', 'SUN', 400)
insert into DailyIncome values ('SPIKE', 'WED', 500)
insert into DailyIncome values ('SPIKE', 'TUE', 200)
DELETE FROM DAILYINCOME


USE AdventureWorks2012 ;  
GO  

SELECT DaysToManufacture 
FROM Production.Product  

drop table dummy;
select  DaysToManufacture, AVG(StandardCost) AS AverageCost into dummy   
FROM Production.Product  
GROUP BY DaysToManufacture

select * from dummy;

insert into dummy
select  DaysToManufacture, AVG(StandardCost) AS AverageCost  
FROM Production.Product  
GROUP BY DaysToManufacture

SELECT * FROM SYS.tables;
SELECT * FROM SYS.TRIGGERS;
SELECT * FROM SYS.OBJECTS;

SELECT DISTINCT TYPE FROM SYS.OBJECTS;
https://docs.microsoft.com/en-us/sql/relational-databases/system-catalog-views/sys-objects-transact-sql?view=sql-server-2017
--PREDICATES, CONTAINS

