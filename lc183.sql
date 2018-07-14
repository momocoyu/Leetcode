# Write your MySQL query statement below
SELECT Customers.Name AS Customers from Customers 
WHERE Customers.Id not in 
( SELECT CustomerId from Orders )
