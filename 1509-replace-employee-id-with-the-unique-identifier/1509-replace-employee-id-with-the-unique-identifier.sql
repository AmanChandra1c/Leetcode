# Write your MySQL query statement below
select unique_id, name
from Employees e left JOIN EmployeeUNI u
ON e.id = u.id;