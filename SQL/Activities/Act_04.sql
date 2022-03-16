REM   Script: Act_04
REM   Salesman Alter

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

select * from salesman;

