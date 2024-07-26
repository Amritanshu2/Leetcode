# Write your MySQL query statement below

SELECT * FROM Cinema WHERE NOT id%2 = 0 AND not description = 'boring' order by rating desc;