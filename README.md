# SpringBoot with Cassandra

## Running Cassandra in Local 
#### To Install Cassandra in Mac
```
brew install Cassandra
```

#### To Start Cassandra

```
cassandra -f
```

#### To access Cassandra from Terminal
```
cqlsh
```

## Getting Started with Cassandra

#### Creating Keyspace
```sql
CREATE KEYSPACE pawandemo WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};

use pawandemo;
```

#### Creating Cassandra Table

```sql
CREATE TABLE Student(
    id int,
    name text,
    dept text,
    year_of_joining int,
    PRIMARY KEY (id)
);

CREATE TABLE Staff (
    id int, 
    name text,
    dept text,
    subjects list<text>, 
    PRIMARY KEY (id, dept)
);
```
#### Inserting sample data in Table

```sql
INSERT INTO Student (id, name, dept, year_of_joining) 
VALUES (1, 'Pawan', 'ISE', 2008);

INSERT INTO Staff (id, name, dept, subjects) 
VALUES (1, 'Mankame Sir', 'ISE', ['Compiler Design', 'Operating System']);
```

Ok, now the DB is ready..! 

In application.properties, give the same keyspace name. 

```
spring.data.cassandra.keyspace-name=pawandemo
```

Create your own Repo interface extending CassandraRepository

```java
interface StudentRepo extends CassandraRepository<Student, Integer> {
}
```
