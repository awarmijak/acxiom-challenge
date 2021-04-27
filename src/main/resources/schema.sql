CREATE TABLE acxiomTable
(
    licenseNumber  INT PRIMARY KEY,
    lastName       VARCHAR(50) NOT NULL,
    firstName      VARCHAR(50) NOT NULL,
    middleName     VARCHAR(50),
    city           VARCHAR(50) NOT NULL,
    state          VARCHAR(50),
    status         VARCHAR(50) NOT NULL,
    issueDate      DATE (50),
    expirationDate DATE (50),
    boardAction    VARCHAR(3)  NOT NULL,

)

LOAD DATA INFILE 'src/main/resources/TXChiropractor.sql'
INTO TABLE acxiomtable
FIELDS TERMINATED BY ' | '
LINES TERMINATED BY '\n';
