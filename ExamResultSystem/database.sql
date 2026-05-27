CREATE DATABASE exam_system;

USE exam_system;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users(username, password)
VALUES ('admin', 'admin123');

CREATE TABLE students (
    roll INT PRIMARY KEY,
    name VARCHAR(100),
    m1 INT,
    m2 INT,
    m3 INT,
    total INT,
    percentage DOUBLE,
    grade VARCHAR(5),
    status VARCHAR(10)
);