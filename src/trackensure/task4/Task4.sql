/*

CREATE TABLE `Employee` (
	`Id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`Name`	TEXT,
	`Salary`	INTEGER,
	`ManagerId`	INTEGER,
	FOREIGN KEY(`ManagerId`) REFERENCES `Manager`(`Id`)
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

SELECT Employee.Name as Employee FROM Employee 
INNER JOIN Manager ON ManagerId = Manager.Id 
WHERE ManagerId IN 
(SELECT Id from Manager WHERE Salary < Employee.Salary)