# MySpringBootMultipleDbDemo
Spring Boot Data JPA by default supports connection with one db via Autoconfiguration, where we just need to give datasource 
inputs(e.g - driver class, url, username, password, dialect, etc.) in properties files and spring-boot takes care of rest.

But to create multiple DB in one service, we need to configure it by ourselves using java configuration style.
Lets do this for two RDBMS, Postgres and MySQL. Here for configuration of DBs, we need objects(beans) of :-
 1. DataSource, 
 2. EntityManagerFactory, and 
 3. TransactionManager.

# Postgres (Db1)
Postgres Database Commands:
cmd>psql -U postgres
create database db1
\c db1
\dt
select * from product;

# MySQL (Db2)
MySQL Database Commands:
create database db2;
use db2;
show tables;
select * from customer;

# Steps to follow:

1. First create spring-boot-starter with data-Jpa, Web, lombok, postgres, mysql, 
   configuration-processor (for ConfigurationProperties), and devtools(to improve our development time).
2. write application.properties
3. Write your two model/entity classes, one each for Postgres & MySQL. We wrote product and customer.
4. Have to write two Repositories as well :- CustomerRepository and ProductRepository.
5. The most important : write two config class, one each for Postgres & MySQL Databases.
6. Runner for inserting data(or write your save methods):
    http://localhost:8080/products
    http://localhost:8080/customer
7. RestController to fetch data.