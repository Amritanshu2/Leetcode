# Write your MySQL query statement below
select a1.name from SalesPerson a1 
where a1.sales_id not in
( select a2.sales_id from Orders a2 
 where a2.com_id  in (select a3.com_id from Company a3 where a3.name = "RED" )
)