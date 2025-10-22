# Write your MySQL query statement below
select u.name as NAME,sum(t.amount) as BALANCE  from Users u JOIN Transactions t ON
u.account=t.account  group by t.account having sum(t.amount)>10000;