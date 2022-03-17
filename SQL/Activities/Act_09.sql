REM   Script: Act_09
REM   Joins

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values (3002, 'Nick Rimando', 'New York', 100, 5001);

insert into customers values (3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers values (3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values (3008, 'Julian Green', 'London', 300, 5002);

insert into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006);

insert into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

insert into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007);

insert into customers values (3001, 'Brad Guzan', 'London', 300, 5005);

CREATE TABLE salesman(  
 Salesman_id int,  
 salesman_name varchar2(20),  
 salesman_city varchar2(20),  
 comission int  
);

INSERT INTO salesman Values (5001,'James Hoog','New York',15);

INSERT INTO salesman Values (5002,'Nail Knite','Paris',13);

INSERT INTO salesman Values (5005,'Pit Alex','London',11);

INSERT INTO salesman Values (5006,'McLyon','Paris',14);

INSERT INTO salesman Values (5007,'Paul Adam','Rome',13);

INSERT INTO salesman Values (5003,'Lauson Hen','San Jose',12);

select c.salesman_id , c.customer_id , c.customer_name  
from customers c 
inner join salesman s 
on c.salesman_id = s.salesman_id;

select c.salesman_id ,s.salesman_name ,c.customer_id , c.customer_name  
from customers c 
inner join salesman s 
on c.salesman_id = s.salesman_id;

SELECT c.customer_name, c.city, c.grade, s.salesman_name , s.city  
FROM customers c 
LEFT OUTER JOIN salesman s 
ON c.salesman_id=s.salesman_id  
WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_name, c.city, c.grade, s.salesman_name , s.salesman_city  
FROM customers c 
LEFT OUTER JOIN salesman s 
ON c.salesman_id=s.salesman_id  
WHERE c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_name, c.city, s.salesman_name , s.comission  
FROM customers c  
INNER JOIN salesman s ON c.salesman_id=s.salesman_id  
WHERE s.comission>12;

SELECT o.order_no, o.order_date, o.purchase_amount, c.customer_name , c.grade,  
s.salesman_name , s.comission FROM orders o 
INNER JOIN customers c ON o.customer_id=c.customer_id  
INNER JOIN salesman s ON c.salesman_id=s.salesman_id;

