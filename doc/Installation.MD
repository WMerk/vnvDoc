# vnv – Verleihen, Dienstleistungen, verschenken
# Installation guide

## Requirements
- Java 8
- Maven
- Docker

## Configuration
Configurations can be done in the application.properties file. 
Please provide correct passwords for the databases. 
The active profile shall be "prod" and "prod" only.

## Installation
### Databases
#### redis

$ docker run --name vnv_redis_new -p 6379:6379 -d redis redis-server --appendonly yes --requirepass password $

#### neo4j

$ $

