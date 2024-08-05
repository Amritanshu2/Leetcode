# Write your MySQL query statement below


SELECT 
    DATE_FORMAT(a.trans_date, '%Y-%m') AS month,
    a.country AS country,
    COUNT(*) AS trans_count,
    SUM(CASE WHEN a.state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
    SUM(a.amount) AS trans_total_amount,
    SUM(CASE WHEN a.state = 'approved' THEN a.amount ELSE 0 END) AS approved_total_amount
FROM Transactions a
GROUP BY DATE_FORMAT(a.trans_date, '%Y-%m'), a.country;
