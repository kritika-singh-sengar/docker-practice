-- Student database
CREATE DATABASE IF NOT EXISTS school_student;
USE school_student;
-- drop database school_student;
CREATE TABLE student (
  id int PRIMARY KEY auto_increment,
  name VARCHAR(255) NOT NULL
);
INSERT INTO student (name) VALUES ('Kritika');
INSERT INTO student (name) VALUES ('Rititka');
INSERT INTO student (name) VALUES ('Nidhi');
INSERT INTO student (name) VALUES ('Sam');

-- Teacher database
-- CREATE DATABASE IF NOT EXISTS school_teacher;
-- USE school_teacher;
-- CREATE TABLE teacher (
--   id int PRIMARY KEY auto_increment,
--   name VARCHAR(255) NOT NULL
-- );
-- INSERT INTO teacher (name) VALUES ('Kritika');
-- INSERT INTO teacher (name) VALUES ('Rititka');
-- INSERT INTO teacher (name) VALUES ('Nidhi');
-- INSERT INTO teacher (name) VALUES ('Sam');
