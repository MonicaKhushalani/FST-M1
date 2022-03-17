REM   Script: Act_08
REM   Aggregator group by

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

select *from orders;

SELECT CUSTOMER_ID, order_date, MAX(purchase_amount) AS "Max Amount"  
FROM orders  
group by CUSTOMER_ID, order_date 
Having MAX(purchase_amount) IN (2030, 3450, 5760, 6000);

select *from orders;

