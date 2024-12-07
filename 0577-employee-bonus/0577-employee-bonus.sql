# Write your MySQL query statement below
SELECT name, bonus
FROM employee e LEFT JOIN bonus b
ON e.empId = b.empId
WHERE b.bonus IS NULL OR b.bonus < 1000;