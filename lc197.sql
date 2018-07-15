# Write your MySQL query statement below
SELECT a.Id
FROM Weather a, Weather b
WHERE a.Temperature >  b.Temperature
AND a.RecordDate = b.RecordDate + INTERVAL 1 DAY
