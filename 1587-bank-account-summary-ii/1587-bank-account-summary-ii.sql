# Write your MySQL query statement below


SELECT s1.name, SUM(s2.amount) AS balance
FROM Users s1
JOIN Transactions s2 ON s1.account = s2.account
GROUP BY  s2.account
HAVING SUM(s2.amount) > 10000;
