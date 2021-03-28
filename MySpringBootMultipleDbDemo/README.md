# MySpringBootMultipleDbDemo
Spring Boot Data JPA by default supports connection with one db via Autoconfiguration, where we just need to give datasource 
inputs(e.g - driver class, url, username, password, dialect, etc.) in properties files and spring-boot takes care of rest.

But to create multiple DB in one service, we need to configure it by ourselves using java configuration style.
Lets do this for two RDBMS, PostgreSQL and MySQL. Here for configuration of DBs, we need objects(beans) of implementation classes of:-
 1. DataSource (Interface), 
 2. EntityManagerFactory (Interface), and 
 3. TransactionManager (Interface).

# PostgreSQL (Db1)
PostgreSQL Database Commands: <br>
cmd>psql -U postgres <br>
create database db1 <br>
\c db1 <br>
\dt <br>
select * from product; <br>

# MySQL (Db2)
MySQL Database Commands: <br>
create database db2; <br>
use db2; <br>
show tables; <br>
select * from customer; <br>

# Steps to follow:

1. First create spring-boot-starter with data-Jpa, web, lombok, postgreSQL, MySQL, 
   configuration-processor (for ConfigurationProperties), and devtools(to improve our development time).
2. write application.properties
3. Write your two model/entity classes, one each for PostgreSQL & MySQL. We wrote product and customer.
4. Have to write two Repositories as well :- CustomerRepository and ProductRepository.
5. The most important : write two config class, one each for Postgres & MySQL Databases.
6. Runner for inserting data(or write your save methods).
7. RestController to fetch data. <br>
    http://localhost:8080/products <br>
    http://localhost:8080/customer 
    
References : https://www.baeldung.com/spring-data-jpa-multiple-databases 
