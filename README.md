# Read Me First

The following was discovered as part of building this project:
## DEMO video in this path You can watch.
https://github.com/kivancbeser/Assignment-KivancEnesBeser/blob/main/KivancEnesBeser_Assignment_Demo.mp4

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
* Demo Video

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


