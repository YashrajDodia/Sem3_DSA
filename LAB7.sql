--LAB 7 PART - A
--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
SELECT MAX(SALARY) AS [MAXIMUM] , MIN(SALARY) AS [MINIMUM] FROM EMP;
--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
SELECT SUM(SALARY) AS 'TOTAL_SAL' , AVG(SALARY) AS 'AVERAGESALARY' FROM EMP; 
--3. Find total number of employees of EMPLOYEE table.
SELECT COUNT(ENAME) AS TOTALNUMBER FROM EMP;
--4. Find highest salary from Rajkot city.
SELECT MAX(SALARY) AS HIGHEST_SALARY FROM EMP WHERE CITY = 'RAJKOT' GROUP BY CITY;
--5. Give maximum salary from IT department.
SELECT MAX(SALARY) AS MAX_SALARY FROM EMP WHERE DEPARTMENT = 'IT' GROUP BY DEPARTMENT;
--6. Count employee whose joining date is after 8-feb-91.
SELECT COUNT(ENAME) FROM EMP WHERE JOININGDATE > '1991-02-08';
--7. Display average salary of Admin department.
SELECT AVG(SALARY) AS AVERAGE_SALARY FROM EMP WHERE DEPARTMENT = 'ADMIN' GROUP BY DEPARTMENT;
--8. Display total salary of HR department.
SELECT SUM(SALARY) AS TOTAL_SALARY FROM EMP WHERE DEPARTMENT = 'HR' GROUP BY DEPARTMENT;
--9. Count total number of cities of employee without duplication.
SELECT COUNT(DISTINCT CITY) AS CITY FROM EMP; 
--10. Count unique departments.
SELECT COUNT(DISTINCT DEPARTMENT) AS UNIQUE_DEPARTMENT FROM EMP;
--11. Give minimum salary of employee who belongs to Ahmedabad.
SELECT MIN(SALARY) AS MIN_SALARY FROM EMP WHERE CITY = 'AHEMDABAD' GROUP BY CITY;
--12. Find city wise highest salary.
SELECT MAX(SALARY) AS MAXI_SALARY FROM EMP GROUP BY CITY;
--13. Find department wise lowest salary.
SELECT MIN(SALARY) AS MIN_SALARY FROM EMP GROUP BY DEPARTMENT;
--14. Display city with the total number of employees belonging to each city.
SELECT COUNT(ENAME) AS TOTAL_EMPLOYEES FROM EMP GROUP BY CITY;
--15. Give total salary of each department of EMP table.
SELECT SUM(SALARY) AS TOT_SALARY FROM EMP GROUP BY DEPARTMENT;
--16. Give average salary of each department of EMP table without displaying the respective department
--name.
SELECT AVG(SALARY) AS AVE_SALARY FROM EMP GROUP BY DEPARTMENT;

--(PART B)

--1. Count the number of employees living in Rajkot.
SELECT COUNT(ENAME) FROM EMP WHERE CITY = 'RAJKOT';
--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
SELECT MAX(SALARY)-MIN(SALARY) AS DIFF FROM EMP;
--3. Display the total number of employees hired before 1st January, 1991.
SELECT COUNT(ENAME) FROM EMP WHERE JOININGDATE < '1991-01-01';

--(PART-C)

--1. Count the number of employees living in Rajkot or Baroda.
SELECT COUNT(ENAME) FROM EMP WHERE CITY = 'RAJKOT' OR CITY = 'BARODA'; 
--2. Display the total number of employees hired before 1st January, 1991 in IT department.
SELECT COUNT(ENAME) FROM EMP WHERE JOININGDATE < '1991-01-01' AND DEPARTMENT = 'IT' GROUP BY DEPARTMENT;
--3. Find the Joining Date wise Total Salaries.
SELECT SUM(SALARY) FROM EMP GROUP BY JOININGDATE;
--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
SELECT MAX(SALARY) , DEPARTMENT , CITY FROM EMP GROUP BY DEPARTMENT,CITY HAVING CITY LIKE 'R%';

--DEPARTMENT WISE HIGHEST SALARY 

