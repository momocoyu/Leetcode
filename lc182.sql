# Write your MySQL query statement below
Select Email from Person group by Email
Having count(Email) >1
