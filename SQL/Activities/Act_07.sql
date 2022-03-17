REM   Script: Act_07
REM   Aggregator

select * from  orders;

select SUM(purchase_amount) AS "Total sum" from orders;

select Avg(purchase_amount) AS "Avgerage sum" from orders;

select Max(purchase_amount) AS "Max sum" from orders;

select Min(purchase_amount) AS "Min sum" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

