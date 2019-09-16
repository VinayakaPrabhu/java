--A SQL Server stored procedure 
--groups one or more Transact-SQL statements into a logical unit 
--stored as an object in the Database Server. 

--CREATE A STORED PROCEDURE
CREATE PROCEDURE uspProductList
AS
BEGIN
    SELECT 
        product_name, 
        list_price
    FROM 
        production.products
    ORDER BY 
        product_name;
END;

--EXECUTE THE PROCEDURE
EXEC uspProductList;
EXECUTE uspProductList;

--ALTER THE PROCEDURE
 ALTER PROCEDURE uspProductList
    AS
    BEGIN
        SELECT 
            product_name, 
            list_price
        FROM 
            production.products
        ORDER BY 
            list_price 
    END;

--Deleting a stored procedure
DROP PROC uspProductList;
DROP PROCEDURE uspProductList;

--Creating a stored procedure with one parameter
create or alter PROCEDURE uspFindProducts(@min_list_price AS DECIMAL)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price >= @min_list_price
    ORDER BY
        list_price;
END;

EXEC uspFindProducts 100;
EXEC uspFindProducts 200;

--Creating a stored procedure with multiple parameters
ALTER PROCEDURE uspFindProducts(
    @min_list_price AS DECIMAL
    ,@max_list_price AS DECIMAL
)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price >= @min_list_price AND
        list_price <= @max_list_price
    ORDER BY
        list_price;
END;

	
EXECUTE uspFindProducts 900, 1000;

--Using named parameters
EXECUTE uspFindProducts 
    @min_list_price = 900, 
    @max_list_price = 1000;

	EXECUTE uspFindProducts 
    @max_list_price = 1000,
	  @min_list_price = 900;

--Creating text parameters
ALTER PROCEDURE uspFindProducts(
    @min_list_price AS DECIMAL
    ,@max_list_price AS DECIMAL
    ,@name AS VARCHAR(max)
)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price >= @min_list_price AND
        list_price <= @max_list_price AND
        product_name LIKE '%' + @name + '%'
    ORDER BY
        list_price;
END;

EXECUTE uspFindProducts 
    @min_list_price = 900, 
    @max_list_price = 1000,
    @name = 'Trek';

--Creating optional parameters
ALTER PROCEDURE uspFindProducts(
    @min_list_price AS DECIMAL = 0
    ,@max_list_price AS DECIMAL = 999999
    ,@name AS VARCHAR(max)
)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price >= @min_list_price AND
        list_price <= @max_list_price AND
        product_name LIKE '%' + @name + '%'
    ORDER BY
        list_price;
END;

EXECUTE uspFindProducts 
    @name = 'Trek';

EXECUTE uspFindProducts 
    @min_list_price = 6000,
    @name = 'Trek';

--Using NULL as the default value
ALTER PROCEDURE uspFindProducts(
    @min_list_price AS DECIMAL = 0
    ,@max_list_price AS DECIMAL = NULL
    ,@name AS VARCHAR(max)
)
AS
BEGIN
    SELECT
        product_name,
        list_price
    FROM 
        production.products
    WHERE
        list_price >= @min_list_price AND
        (@max_list_price IS NULL OR list_price <= @max_list_price) AND
        product_name LIKE '%' + @name + '%'
    ORDER BY
        list_price;
END;

EXECUTE uspFindProducts 
    @min_list_price = 500,
    @name = 'Haro';


--Declaring a variable
DECLARE @model_year SMALLINT;
--Declaring multiple variables
DECLARE @model_year SMALLINT, 
        @product_name VARCHAR(MAX);
--Assigning a value to a variable
SET @model_year = 2018;

--Using variables in a query
DECLARE @model_year SMALLINT;
 
SET @model_year = 2018;
 
SELECT
    product_name,
    model_year,
    list_price 
FROM 
    production.products
WHERE 
    model_year = @model_year
ORDER BY
    product_name;


--Storing query result in a variable
DECLARE @product_count INT;
SET @product_count = (
    SELECT 
        COUNT(*) 
    FROM 
        production.products 
);
SELECT @product_count;
PRINT @product_count;
PRINT 'The number of products is ' + CAST(@product_count AS VARCHAR(MAX));

--To hide the number of rows affected messages	
SET NOCOUNT ON;  

--Selecting a record into variables
DECLARE 
    @product_name VARCHAR(MAX),
    @list_price DECIMAL(10,2);

SELECT 
    @product_name = product_name,
    @list_price = list_price
FROM
    production.products
WHERE
    product_id = 100;

SELECT 
    @product_name AS product_name, 
    @list_price AS list_price;

--Accumulating values into a variable
CREATE  PROC uspGetProductList(
    @model_year SMALLINT
) AS 
BEGIN
    DECLARE @product_list VARCHAR(MAX);
 
    SET @product_list = '';
 
    SELECT
        @product_list = @product_list + product_name 
                        + CHAR(10)
    FROM 
        production.products
    WHERE
        model_year = @model_year
    ORDER BY 
        product_name;
 
    PRINT @product_list;
END;
EXEC uspGetProductList 2018

-------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
--MORE EXAMPLES
use demo;

alter PROCedure What_DB_is_this     
AS   
SELECT DB_NAME() AS ThisDB; 


execute What_DB_is_this;
exec  What_DB_is_this;

SELECT * FROM SALES;
SELECT * FROM SYS.DATABASES;
SELECT DB_NAME(database_id) AS [Database], database_id  
FROM sys.databases;  

CREATE PROC What_DB_is_that @ID int   
AS    
SET NOCOUNT ON
SELECT DB_NAME(@ID) AS ThatDB;   
EXEC What_DB_is_that 2 

USE AdventureWorks2012;  
GO  


CREATE OR ALTER PROCEDURE HumanResources.uspGetEmployeesTest2   
    @LastName nvarchar(50),   
    @FirstName nvarchar(50)   
AS   
    --SET NOCOUNT ON;  
    SELECT FirstName, LastName, Department  
    FROM HumanResources.vEmployeeDepartmentHistory  
    WHERE FirstName = @FirstName AND LastName = @LastName  
    AND EndDate IS NULL;  
GO 

EXECUTE HumanResources.uspGetEmployeesTest2 N'Ackerman', N'Pilar';  
-- Or  
EXEC HumanResources.uspGetEmployeesTest2 @LastName = N'Ackerman', @FirstName = N'Pilar';  
GO  
-- Or  
EXECUTE HumanResources.uspGetEmployeesTest2 @FirstName = N'Pilar', @LastName = N'Ackerman';  
GO