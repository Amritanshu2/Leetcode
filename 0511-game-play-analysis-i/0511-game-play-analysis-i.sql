# Write your MySQL query statement below
select s2.player_id,
(select s1.event_date from Activity s1 where s2.player_id = s1.player_id order by s1.event_date limit 1) as first_login
from Activity s2 group by s2.player_id ;