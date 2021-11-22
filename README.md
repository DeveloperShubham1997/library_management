# library_management
library management restful service

#SQL Commands 
create table demo.library(id int NOT NULL auto_increment, bookName varchar(30) not null, author varchar(30) not null,primary key(id));
insert demo.library(bookName,author) values("book2","shubham");
