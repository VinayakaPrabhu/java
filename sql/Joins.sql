--CREATE TABLES
USE DEMO
DROP TABLE T1
DROP TABLE T2
CREATE TABLE T1(C1 INT, C2 CHAR(1));
CREATE TABLE T2(C1 INT, C3 CHAR(1));

SELECT * FROM T1;
SELECT * FROM T2;

INSERT T1 VALUES (1,'A')
INSERT T1 VALUES (2,'B')
INSERT T1 VALUES (3,'C')

INSERT T2 VALUES (1,'D')
INSERT T2 VALUES (2,'E')
INSERT T2 VALUES (4,'F')

SELECT * FROM T1;
SELECT * FROM T2;

SELECT * FROM T1 CROSS JOIN T2
SELECT T1.C1,T1.C2,T2.C3 FROM T2 CROSS JOIN T1
WHERE T1.C1 < 3;

SELECT * FROM T2 CROSS JOIN T1 ORDER BY T2.C1 

SELECT T1.C2,T2.C3 FROM T1 CROSS JOIN T2;
SELECT TABLE1.C2,T2.C3 FROM T1 AS TABLE1 CROSS JOIN T2;
SELECT T1.C2,T2.C3 AS 'TABLE2_C3' FROM T1 CROSS JOIN T2;
SELECT TABLE1.C2,T2.C3 AS 'TABLE2_C3' FROM T1 AS TABLE1 CROSS JOIN T2;

--INNER JOIN
SELECT * FROM T1 JOIN T2 ON T1.C1 = T2.C1;

--LEFT OUTER JOIN
SELECT * FROM T1 LEFT OUTER JOIN T2 ON T1.C1 = T2.C1;

--RIGHT OUTER JOIN
SELECT * FROM T1 RIGHT OUTER JOIN T2 ON T1.C1 = T2.C1;

--RIGHT OUTER JOIN
SELECT * FROM T1 full OUTER JOIN T2 ON T1.C1 = T2.C1;

--NON EQUI JOIN
--INNER JOIN
SELECT * FROM T1 JOIN T2 ON T1.C1 != T2.C1;
SELECT * FROM T1 JOIN T2 ON T1.C1 > T2.C1;

--SELF JOIN
SELECT * FROM T1 JOIN T2 ON T1.C1 = T1.C1;


--CROSS JOIN syntax
--A list of all possible combinations of BusinessEntityID rows and all 
--Department name rows are returned.
USE AdventureWorks2012
SELECT e.BusinessEntityID, d.Name AS Department  
FROM HumanResources.Employee AS e  
CROSS JOIN HumanResources.Department AS d  
ORDER BY e.BusinessEntityID, d.Name ; 

SELECT * FROM HumanResources.Employee
SELECT * FROM HumanResources.Department

--INNER JOIN
-- By default, SQL Server performs an INNER JOIN if only the JOIN   
-- keyword is specified.  
--returns all product names and sales order IDs.

SELECT p.Name, sod.SalesOrderID  
FROM Production.Product AS p  
INNER JOIN Sales.SalesOrderDetail AS sod  
ON p.ProductID = sod.ProductID  
ORDER BY p.Name ;  

--LEFT OUTER JOIN syntax
SELECT p.Name, sod.SalesOrderID  
FROM Production.Product AS p  
LEFT OUTER JOIN Sales.SalesOrderDetail AS sod  
ON p.ProductID = sod.ProductID  
ORDER BY p.Name ;

--RIGHT OUTER JOIN syntax
SELECT st.Name AS Territory, sp.BusinessEntityID  
FROM Sales.SalesTerritory AS st   
RIGHT OUTER JOIN Sales.SalesPerson AS sp  
ON st.TerritoryID = sp.TerritoryID ;  

USE AdventureWorks2012
--JOINING MULTIPLE TABLES
SELECT * FROM PRODUCTION.PRODUCT;
SELECT * FROM PRODUCTION.ProductPhoto;
SELECT * FROM PRODUCTION.ProductProductPhoto;

SELECT LargePhotoFileName, NAME 
FROM PRODUCTION.PRODUCT
JOIN PRODUCTION.ProductProductPhoto ON PRODUCTION.PRODUCT.ProductID = PRODUCTION.ProductProductPhoto.ProductID
JOIN PRODUCTION.ProductPhoto ON PRODUCTION.ProductProductPhoto.ProductPhotoID = PRODUCTION.ProductPhoto.ProductPhotoID;