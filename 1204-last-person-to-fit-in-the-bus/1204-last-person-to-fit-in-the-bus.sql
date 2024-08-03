SELECT person_name
FROM (
    SELECT person_name, weight,
           SUM(weight) OVER (ORDER BY turn) AS running_weight
    FROM Queue
) AS subquery
WHERE running_weight <= 1000
ORDER BY running_weight DESC
LIMIT 1;
