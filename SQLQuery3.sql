--1. Create table Employee_detail from Employee with all the columns and data.
	SELECT * INTO EMPLOYEE_DETAIL FROM EMPLOYEE; 
--2. Create table Employee_data from Employee with first two columns with no data.
	SELECT NAME , CITY INTO EMPLOYEE_DATA1 FROM EMPLOYEE WHERE 1=2;
--3. Create table Employee_info from Employee with no Data
	SELECT * INTO EMPLOYEE_INFO FROM EMPLOYEE WHERE 1=2;

	SELECT * FROM EMPLOYEE_DETAIL;
	SELECT * FROM EMPLOYEE_DATA1;
	SELECT * FROM EMPLOYEE_INFO;

	--Part – C:
 --   Perform following queries on Employee table.
 --   1. Insert the Data into Employee_info from Employee whose CITY is Rajkot
	  INSERT INTO EMPLOYEE_INFO SELECT * FROM EMPLOYEE WHERE CITY = 'RAJKOT';

 --   2. Insert the Data into Employee_info from Employee whose age is more than 32.	  INSERT INTO EMPLOYEE_INFO SELECT * FROM EMPLOYEE WHERE AGE>32;--Part – B: UPDATE
--1. Give 10% Increment in Loan Amount. (Use Borrow Table)
UPDATE BORROW SET AMOUNT = AMOUNT + (10*AMOUNT)/100;
SELECT * FROM BORROW;
--2. Customer deposits additional 20% amount to their account, update the same. (Use Deposit Table)UPDATE DEOSITE SET AMOUNT = AMOUNT + (20*AMOUNT)/100;SELECT * FROM DEOSITE;--Part – C:
--1. Update amount of loan no 321 to NULL. (Use Borrow Table)
     UPDATE BORROW SET AMOUNT = NULL WHERE LOANO = 321;
--2. Update branch name of KRANTI to NULL (Use Borrow Table)
     UPDATE BORROW SET BNAME = NULL WHERE CNAME = 'KRANTI';
--3. Display the name of borrowers whose amount is NULL. (Use Borrow Table)
     SELECT CNAME FROM BORROW WHERE AMOUNT IS NULL;
--4. Display the Borrowers whose having branch. (Use Borrow Table)
     SELECT CNAME FROM BORROW WHERE BNAME IS NOT NULL; 
--5. Update the Loan Amount to 5000, Branch to VRCE & Customer Name to Darshan whose loan no is 481.
--(Use Borrow Table)
      
--6. Update the Deposit table and set the date to 01-01-2021 for all the depositor whose amount is less
--than 2000.
--7. Update the Deposit table and set the date to NULL & Branch name to ‘ANDHERI whose Account No is
--110.