CREATE DATABASE user_management_data;

-- Use the database
USE user_management_data;

-- Create Table1 - user
CREATE TABLE user_details (
    id INT PRIMARY KEY NOT NULL  auto_increment COMMENT 'This is primary key & it is Unique identifier for each user',
    first_name VARCHAR(30) NOT NULL COMMENT 'First name of the user',
    middle_name VARCHAR(30) NOT NULL COMMENT 'Middle name of the user',
    last_name VARCHAR(30) NOT NULL COMMENT 'Last name of the user',
    user_name VARCHAR(20) NOT NULL COMMENT 'User_name of the user',
    mobile VARCHAR(14) UNIQUE NOT NULL COMMENT 'Mobile number of the user - 10 digit no + county code',
    email VARCHAR(50) UNIQUE NOT NULL COMMENT 'Email id of the user',
    date_of_birth VARCHAR(10) NOT NULL COMMENT 'Date Of Birth Of the User',
    adhaar_no VARCHAR(12) UNIQUE NOT NULL COMMENT 'Adhaar number of the user',
    gender VARCHAR(10) NOT NULL COMMENT 'Gender Of User',
    created_by INT COMMENT 'Identifier of the user who created this record.',
    created_at DATETIME Null COMMENT 'Timestamp of when the user was created.',
    updated_by INT COMMENT 'Identifier of the user who last updated this record.',
    updated_at DATETIME Null COMMENT 'Timestamp of the last update to the user\'s data.'


);
