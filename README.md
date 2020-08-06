1-
In order to handle exceptions in a Rest-API the following annotation is used:

  - @RestControllerAdvise

2-
In order to use Swagger, the below 2 dependencies have to added to the pom.xml file:

io.springfox//springfox-swagger-ui//2.9.2

io.springfox//springfox-swagger2//2.9.2

Also a class has to be created.  The new class will need to:
- be annotated so that it is managed by the spring container (for instance with @Configuration)
- use the annotation @EnableSwagger2

