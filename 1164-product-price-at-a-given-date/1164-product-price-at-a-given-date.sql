SELECT p1.product_id,
       COALESCE((SELECT p2.new_price
                 FROM Products p2
                 WHERE p2.product_id = p1.product_id
                   AND p2.change_date <= '2019-08-16'
                 ORDER BY p2.change_date DESC
                 LIMIT 1), 10) AS price
FROM Products p1
GROUP BY p1.product_id;
