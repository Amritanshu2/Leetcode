# Select id, 'Root' as type from Tree where p_id is null 
# union
# select t1.id as id, 'Leaf' as type from Tree t1 where t1.id NOT in (select t2.p_id from Tree t2)
# union 
# select t1.id as id, 'Inner' as type from Tree t1 where t1.id in (select t2.p_id from Tree t2)

SELECT 
    id,
    CASE
        WHEN p_id IS NULL THEN 'Root'
        WHEN id IN (SELECT DISTINCT p_id FROM Tree WHERE p_id IS NOT NULL) THEN 'Inner'
        ELSE 'Leaf'
    END AS type
FROM Tree;
