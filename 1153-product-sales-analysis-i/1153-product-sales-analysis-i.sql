# Write your MySQL query statement below
select product_name, year, price
from Sales s JOIN Product p
ON s.Product_id = p.Product_id