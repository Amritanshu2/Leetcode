# Write your MySQL query statement below
# SELECT 
# (select b.sell_date from Activities as b where b.sell_date = A.sell_date group by b.product order by sell_date desc limit 1) as sell_date,
# count(A.product) as num_sold, A.product as products 
# from Activities as A Group by product;

# SELECT 
# A.sell_date as sell_date,
# count(A.sell_date) as num_sold, 
# (select b.product from Activities as b where A.sell_date = b.sell_date order by b.product) as products
# from Activities as A GROUP BY sell_date;

SELECT 
    A.sell_date AS sell_date,
    COUNT(distinct(A.product)) AS num_sold,
    (SELECT GROUP_CONCAT(distinct(b.product) ORDER BY b.product SEPARATOR ',')
     FROM Activities AS b 
     WHERE b.sell_date = A.sell_date) AS products
FROM Activities AS A
GROUP BY A.sell_date;
