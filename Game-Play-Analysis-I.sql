# Write your MySQL query statement below
SELECT player_id , MIN(event_date) as first_login 
FROM Activity 
Group by player_id;