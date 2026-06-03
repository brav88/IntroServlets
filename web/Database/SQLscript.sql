CREATE DATABASE MyApp;

USE MyApp;

SELECT * FROM Student;

CREATE TABLE Student (
  StudentID int AUTO_INCREMENT PRIMARY KEY,
  FirstName varchar(50),
  LastName varchar(50) NOT NULL,  
  DOB DATE,
  Career varchar(100)
);

INSERT INTO Student (FirstName, LastName, DOB, Career)
VALUES ('Violeta', 'Rodriguez', '1999-01-09', 'Administracion Empresas');

INSERT INTO Student (FirstName, LastName, DOB, Career)
VALUES ('Santiago', 'Carvajal', '2002-03-15', 'Ingenieria Informatica');

INSERT INTO Student (FirstName, LastName, DOB, Career) VALUES ('Sebastian', 'Rojas', '1997-02-20', 'Ingenieria Civil');

UPDATE Student SET LastName = "Rojas" where StudentId = 3