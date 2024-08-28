SELECT 
    r.id AS id,
    SUM(CASE WHEN r.month = 'Jan' THEN r.revenue ELSE NULL END) AS Jan_Revenue,
    SUM(CASE WHEN r.month = 'Feb' THEN r.revenue ELSE NULL END) AS Feb_Revenue,
    SUM(CASE WHEN r.month = 'Mar' THEN r.revenue ELSE NULL END) AS Mar_Revenue,
    SUM(CASE WHEN r.month = 'Apr' THEN r.revenue ELSE NULL END) AS Apr_Revenue,
    SUM(CASE WHEN r.month = 'May' THEN r.revenue ELSE NULL END) AS May_Revenue,
    SUM(CASE WHEN r.month = 'Jun' THEN r.revenue ELSE NULL END) AS Jun_Revenue,
    SUM(CASE WHEN r.month = 'Jul' THEN r.revenue ELSE NULL END) AS Jul_Revenue,
    SUM(CASE WHEN r.month = 'Aug' THEN r.revenue ELSE NULL END) AS Aug_Revenue,
    SUM(CASE WHEN r.month = 'Sep' THEN r.revenue ELSE NULL END) AS Sep_Revenue,
    SUM(CASE WHEN r.month = 'Oct' THEN r.revenue ELSE NULL END) AS Oct_Revenue,
    SUM(CASE WHEN r.month = 'Nov' THEN r.revenue ELSE NULL END) AS Nov_Revenue,
    SUM(CASE WHEN r.month = 'Dec' THEN r.revenue ELSE NULL END) AS Dec_Revenue
FROM 
    Department r
GROUP BY 
    r.id;
