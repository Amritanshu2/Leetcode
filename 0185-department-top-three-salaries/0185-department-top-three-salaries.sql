SELECT s.name as Department, s1.name as Employee, s1.Salary 
FROM Employee s1 
JOIN Department s ON s1.departmentId = s.id 
WHERE s1.salary > COALESCE(
    (SELECT DISTINCT s2.Salary 
    FROM Employee s2 
    where s1.departmentId = s2.departmentId
    ORDER BY s2.Salary DESC 
    LIMIT 1 OFFSET 3),-1
) order by s1.salary desc;

