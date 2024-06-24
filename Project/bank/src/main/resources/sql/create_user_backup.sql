CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) not null,
    last_name VARCHAR(50) not null,
    gender char(1) not null,
    email VARCHAR(50) UNIQUE not null,
    mobile_no VARCHAR(11) not null,
    date_of_birth DATE not null,
    address VARCHAR(255) not null,
    city VARCHAR(40) not null,
    state VARCHAR(50) not null,
    zipcode VARCHAR(10) not null,
	created_by INT NULL,
    created_at DATETIME NULL,
    updated_by INT NULL,
    updated_at DATETIME NULL
);