# Read Me First

The following was discovered as part of building this project:

* The following dependencies are not known to work with Spring Native: 'Spring Boot DevTools, Spring Configuration
  Processor'. As a result, your application may not work as expected.

# Getting Started
<!-- USAGE EXAMPLES -->
## Usage

1. Mvn-clean install and run application.

2. Go to Browser and Try Rest-Api
```sh
http://localhost:8080/ 
```

3. To Check Data open database 
```sh
http://localhost:8080/h2-console/
```

```sh 
In application.properties
username: sa
password: as
```

<!-- Explore Rest APIs -->
## Explore Rest APIs

The app defines following CRUD APIs.


### Data

| Method | Url                    | Description                   | 
|--------|------------------------|-------------------------------|
| GET    | /uploadData            | Upload resources/exercise.csv |
| GET    | /findAllData           | Find All Data                 |
| GET    | /findDataByCode/{code} | Find Data By Code             |
| GET    | /deleteAllData         | Delete All Data               |

You can test them using postman.

<!-- Done -->
## Done
* Create Crud Operation
* Create Backend SpringBoot Project
* Hibernate Implementation
* Create Entity
* Create Repository
* Create Service
* Create Controller
* Adding Unit Test

<!-- TODO -->
## TODO
* Lombok
* Input Validations
* Swagger
* More comment for spring side.
* Add More Unit Test
* Sonar
* Authorization and Authentication.
* API Gateway(If caching, security and traceability are desired, one more layer can be added and an API Gateway)
* [Kıvanç Enes Beşer Github Account](https://github.com/kivancbeser)

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

### Additional Links

These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#spring-aot-maven)

## Spring Native

This project has been configured to let you generate either a lightweight container or a native executable.

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get started with Spring
Native.
Docker should be installed and configured on your machine prior to creating the image,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-buildpacks)
.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image
```

Then, you can run the app like any other container:

```
$ docker run --rm Assignment:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-native-build-tools)
.

To create the executable, run the following goal:

```
$ ./mvnw package -Pnative
```

Then, you can run the app as follows:

```
$ target/Assignment
```
