1-
In order to handle exceptions in a Rest-API the following annotation is used:

  - @RestControllerAdvise

2-
In order to use Swagger, the below 2 dependencies have to added to the pom.xml file:

<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger-ui</artifactId>
  <version>2.9.2</version>
</dependency>

<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger2</artifactId>
  <version>2.9.2</version>
</dependency>

Also a class has to be created.  The new class will need to:
- be annotated so that it is managed by the spring container (for instance with @Configuration)
- use the annotation @EnableSwagger2

