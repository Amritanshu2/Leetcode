# Write your MySQL query statement below
# select s.name, SUM(COALESCE(s1.distance, 0)) as travelled_distance from  Users s left join Rides s1 on s.id = s1.user_id  group by s1.user_id order by travelled_distance desc ,s.name asc;
SELECT s.name,COALESCE(
    (SELECT SUM(s1.distance)
                 FROM Rides s1
                 WHERE s.id = s1.user_id
                 GROUP BY s1.user_id),
    0) AS travelled_distance
FROM Users s
ORDER BY travelled_distance DESC, s.name ASC;
