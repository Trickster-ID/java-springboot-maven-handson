-- CREATE DATABASE handson_java_spring_maven;

create table handson_java_spring_maven.users (
   id bigint not null auto_increment,
   email varchar(255),
   name varchar(255),
   primary key (id)
);