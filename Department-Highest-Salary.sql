# Write your MySQL query statement below

select d.name as Department,
       e.name as Employee ,
       e.salary as Salary 
from Employee e
JOIN Department d ON
e.departmentId =d.id
    WHERE salary=(
        select MAX(salary) from employee
        where departmentId=e.departmentId
     )