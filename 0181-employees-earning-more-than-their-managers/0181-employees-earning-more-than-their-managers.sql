# Write your MySQL query statement below
select s1.name as Employee from Employee s1 where s1.salary>(select s2.salary from Employee s2 where s2.id = s1.managerId);