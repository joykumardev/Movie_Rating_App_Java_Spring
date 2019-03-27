This is a demo project that demonstrates Spring Cloud for building a microservices architecture.

Description :
The application is movie rating application. Every movie has a Genre and user can rate the movies and check the rating of movies also. 
Design of these services are as below:

1. Spring cloud's Eureka service is used as Discovery service.
2. Every Other service i.e. Movie, Recommendation, Configuration, Users service register itself with this eureka discovery service.
3. Api Gateway is used as entry point for external clients, API gateway will discover other services from Eureka service according to the context in request.
4. Each module is developed using separate microservice to loose couple the application.


To build and run this project below are the commands:

1. Goto directory of each individual project and run below command:
		gradle bootJar
2. It will create runnable jar file in each projects build\libs directory.
3. Run the each jar using below command(there is no any order of running thesre jar files)
		java -jar <<jar-file-name>>.jar


Tech stack used:

1. Microservices
2. Spring boot
3. Spring cloud
4. Hibernate
5. Neo4j
6. Java8
7. REST
8. gradle

