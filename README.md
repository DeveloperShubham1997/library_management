## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Prerequisite](#prerequisite)
* [SQL Commands](#SQL-Commands)
* [How to run](#How-to-run)
* [Documentation](#Documentation)

## General info
library management restful service
	
## Technologies
Project is created with:
* Java : 11
* Spring Boot: 2.5
* Mysql
	
## Prerequisite
To run this project, you require java 11 and mysql:

## SQL-Commands 
create table demo.library(id int NOT NULL auto_increment, book_name varchar(30) not null, author varchar(30) not null,primary key(id));

## How-to-run
java -jar library-0.0.1-SNAPSHOT.jar (jar file can be found in target folder).

## Documentation
open browser and hit "hhtp://localhost:8080/swagger-ui.html" . Here you can find all available end points.
