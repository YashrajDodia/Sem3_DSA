--Part – A:
--Views (First create a view then display all views)

SELECT * FROM STUDENT_INFO;
--1. Create a view Personal with all columns.
CREATE VIEW 
	PERSONAL 
	AS 
	SELECT * FROM STUDENT_INFO; 
SELECT * FROM PERSONAL;
--2. Create a view Student_Details having columns Name, Branch & SPI.
CREATE VIEW STUDENT_DETAILS AS SELECT 
NAME , BRANCH , SPI FROM STUDENT_INFO;
SELECT * FROM STUDENT_DETAILS;

--3. Create a view AcademicData having columns RNo, Name, Branch.
CREATE VIEW ACADEMIC_DATA AS SELECT 
RNO , NAME , BRANCH FROM STUDENT_INFO;
--4. Create a view Student_ bklog having all columns but students whose bklog more than 2.
CREATE VIEW STUDENT_BKLOG AS SELECT * FROM STUDENT_INFO WHERE BACKLOG>2;
--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four
--letters.
CREATE VIEW STUDENT_PATTERN AS SELECT 
RNO , NAME , BRANCH FROM STUDENT_INFO WHERE NAME LIKE '____';
SELECT * FROM STUDENT_PATTERN;
--6. Insert a new record to AcademicData view. (107, Meet, ME)
INSERT INTO ACADEMIC_DATA VALUES(107,'MEET','ME'); 
SELECT * FROM ACADEMIC_DATA;
--7. Update the branch of Amit from CE to ME in Student_Details view.
UPDATE STUDENT_DETAILS SET BRANCH = 'ME' WHERE NAME = 'AMIT';
--8. Delete a student whose roll number is 104 from AcademicData view.
DELETE FROM ACADEMIC_DATA WHERE RNO = 104;

--Part – B:
--1. Create a view that displays information of all students whose SPI is above 8.5.

--2. Create a view that displays 0 backlog students.
--3. Create a view Computerview that displays CE branch data only