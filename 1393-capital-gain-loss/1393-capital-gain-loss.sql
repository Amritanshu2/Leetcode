# Write your MySQL query statement below
SELECT 
    stock_name, 
   sum(case
        when operation = "sell" then price
        when operation = "buy" then -price
    end)
    AS capital_gain_loss
    FROM 
    Stocks 
    GROUP BY 
    stock_name;




