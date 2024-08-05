# Write your MySQL query statement 
Select a.user_id,  CONCAT(UPPER(SUBSTRING(a.name, 1, 1)), LOWER(SUBSTRING(a.name, 2))) AS name  from Users a order by user_id;