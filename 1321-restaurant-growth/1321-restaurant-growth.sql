# Write your MySQL query statement below
select visited_on,amount,round(amount/7,2) average_amount from 
(
    select visited_on,
    sum(amount) over(order by visited_on asc rows between 6 preceding and current row) amount,
    row_number() over(order by visited_on asc) rnm

    from 
    (
        select visited_on,sum(amount) amount 
        from Customer 
        group by visited_on
    )sumperday    
)tempalias    
where rnm>6