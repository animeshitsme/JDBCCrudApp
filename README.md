# JDBCCrudApp
This project requires 3 External Jars to run. <br>

-- This one is used to connect to MySQL server<br>
1. **mysql-connector-j-8.2.0.jar**<br>

--Both of these is required to create the connection pool as we have used a third party jar Hikari to get an efficient Connection pool. <br>
2. **HikariCP-3.4.5.jar** <br>
3. **slf4j-api-2.0.1.jar**<br>

Database Requirement: We have used **MySQl** as the DB vendor for this project<br>

This project connects to **Student** table present in **octbatch** DB/ Schema having columns (id, name, age, address) where we have made the id as Primary key with auto increment option enabled
