# Write your MySQL query statement below
Select distinct(a.num) as ConsecutiveNums from Logs a
where 
(select count(b.num) from  Logs b where b.num = a.num and (a.id+1 = b.id or b.id = a.id+2)) = 2 ;