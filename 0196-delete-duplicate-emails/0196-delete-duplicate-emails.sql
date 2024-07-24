# Write your MySQL query statement below

DELETE s1 FROM Person s1
INNER JOIN Person s2
WHERE s1.email = s2.email
and s1.id>s2.id;

 


