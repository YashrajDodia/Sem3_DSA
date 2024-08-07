CREATE TABLE CRICKET(NAME VARCHAR(50) , CITY VARCHAR(20) , AGE INT);

SELECT * FROM CRICKET;
INSERT INTO CRICKET VALUES('SACHIN TENDULKAR' , 'MUMBAI' , 30),
('RAHUL DRAVID' , 'BOMBAY' , 35),('M.S. DHONI' , 'JHARKHAND' , 31),
('SURESH RAINA' , 'GUJARAT' , 31);

--1. Create table Worldcup from cricket with all the columns and data.
SELECT * INTO WORLDCUP FROM CRICKET;
SELECT * FROM WORLDCUP;

--2. Create table T20 from cricket with first two columns with no data.
SELECT NAME,CITY INTO T20 FROM CRICKET WHERE 1=2;
SELECT * FROM T20;

--3. Create table IPL From Cricket with No Data
SELECT * INTO IPL FROM CRICKET WHERE 1=2;
SELECT * FROM IPL;

