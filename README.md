# Demoracle

Este microservicio usa una conexión con una base de datos Oracle.

## Dependencias

Las dependencias usadas son:

- Spring Boot Starter
- Spring Boot Starter Data Rest
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot DevTools

```
<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-rest</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.apache.tomcat</groupId>
                    <artifactId>tomcat-jdbc</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.oracle.ojdbc</groupId>
            <artifactId>ojdbc8</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>

```

## Configuración
Se debe tener un archivo *.ora* o más conocido como **TNSNAMES**. Este archivo incluye la información de conexión al servidor de base de datos. Es como un string de conexión

### application.properties
```
## use create when running the app for the first time
## then change to "update" which just updates the schema when necessary
## spring.jpa.hibernate.ddl-auto=create
spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
spring.datasource.url= jdbc:oracle:thin:@FAMIDESA?TNS_ADMIN=/Users/hb/Dropbox/Amisoft/Oracle/
## spring.datasource.url= jdbc:oracle:thin:@FAMIDESA?TNS_ADMIN=$TNS_ADMIN
spring.datasource.username=TRIFAM
spring.datasource.password=utf0808
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
## this shows the sql actions in the terminal logs
spring.jpa.show-sql=true
##optional, but just in case another application is listening on your default  port (8080)
server.port = 8034
```