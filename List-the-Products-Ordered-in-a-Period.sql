# Write your MySQL query statement below
select p.product_name ,sum(o.unit) as unit 
from Products p JOIN Orders o  ON
p.product_id  =o.product_id  
where o.order_date LIKE '2020-02-%'
group by  o.product_id 
having   sum(o.unit)>=100  