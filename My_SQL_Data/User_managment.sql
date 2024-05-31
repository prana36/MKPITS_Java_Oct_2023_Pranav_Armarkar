-- Create the database
CREATE DATABASE user_management_data;

-- Use the database
USE user_management_data;

-- Create Table1 - user
CREATE TABLE user_details (
    id INT PRIMARY KEY NOT NULL COMMENT 'This is primary key & it is Unique identifier for each user',
    first_name VARCHAR(30) NOT NULL COMMENT 'First name of the user',
    middle_name VARCHAR(30) NOT NULL COMMENT 'Middle name of the user',
    last_name VARCHAR(30) NOT NULL COMMENT 'Last name of the user',
    mobile VARCHAR(14) UNIQUE NOT NULL COMMENT 'Mobile number of the user - 10 digit no + county code',
    email VARCHAR(50) UNIQUE NOT NULL COMMENT 'Email id of the user',
    date_of_birth VARCHAR(10) NOT NULL COMMENT 'Date Of Birth Of the User',
    adhaar_no VARCHAR(12) UNIQUE NOT NULL COMMENT 'Adhaar number of the user',
    gender VARCHAR(10) NOT NULL COMMENT 'Gender Of User',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT 'Timestamp of when the user was created.',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Timestamp of the last update to the user\'s data.',
    created_by VARCHAR(50) COMMENT 'Identifier of the user who created this record.',
    updated_by VARCHAR(50) COMMENT 'Identifier of the user who last updated this record.'
);

-- Create the user_credentials table
CREATE TABLE user_credentials (
    id INT PRIMARY KEY NOT NULL COMMENT 'unique identifier for the user credential.',
    user_id INT NOT NULL COMMENT 'Foreign key, references the users table.id column',
    username VARCHAR(50) UNIQUE NOT NULL COMMENT 'Username of the user',
    password VARCHAR(50) NOT NULL COMMENT 'Hashed version of the user\'s password.',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT 'Timestamp of when the user was created.',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Timestamp of the last update to the user\'s data.',
    created_by VARCHAR(50) COMMENT 'Identifier of the user who created this record.',
    updated_by VARCHAR(50) COMMENT 'Identifier of the user who last updated this record.'
);

-- Create the user_login table
CREATE TABLE user_login (
    id INT PRIMARY KEY NOT NULL COMMENT 'unique identifier for the user login.',
    user_id INT NOT NULL COMMENT 'Foreign key, references the users table.id column',
    login_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT 'Timestamp of the login.',
    logout_time TIMESTAMP COMMENT 'Timestamp of the logout.',
    last_login TIMESTAMP COMMENT 'Timestamp of the last login.',
    forget_password_count INT NOT NULL COMMENT 'Forget password count when user forgets the password.',
    number_of_retry INT NOT NULL COMMENT 'Count of retries when user tries to login.',
    invalid_login_time TIMESTAMP COMMENT 'Timestamp of the last invalid login attempt.',
    wrong_login_retry INT DEFAULT 0 COMMENT 'Number of consecutive wrong login attempts.',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT 'Timestamp of when the user was created.',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Timestamp of the last update to the user\'s data.',
    created_by VARCHAR(50) COMMENT 'Identifier of the user who created this record.',
    updated_by VARCHAR(50) COMMENT 'Identifier of the user who last updated this record.'
);

-- drop database user_management_data;