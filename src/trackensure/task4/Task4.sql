/*

CREATE TABLE `Employee` (
	`Id`	INTEGER NOT NULL,
	`Name`	TEXT,
	`Salary`	INTEGER,
	`ManagerId`	INTEGER
);

CREATE TABLE `Manager` (
	`Id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`Name`	TEXT,
	`Salary`	INTEGER
);

*/

/*
Getting all employees with higher salary that their manager has..
*/

SELECT Name as Employee FROM Employee WHERE ManagerId IN 
(SELECT Id from Manager WHERE Salary < Employee.Salary)