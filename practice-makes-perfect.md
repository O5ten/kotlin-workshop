A RESTful API for a microservice using Kotlin!
------------------
In [the github project for these pages](https://github.com/O5ten/kotlin-workshop/tree/master/kotlin-api) there's a folder called kotlin-api. It contains a small stub-project with dependencies from [sparkjava](http://sparkjava.com) that has a sub-project for Kotlin. You should go check it out!

Project Structure
----------------
Classic Maven project

```
kotlin-api
│   pom.xml
└───src
   └───main   
   │   └───kotlin
   └───test
       └───kotlin
````

Let's have a look at the pom
-----------------
[The pom](kotlin-api/pom.xml)

- sparkjava, gson, kotlin-stdlib, kotlin-test-junit
- Kotlin Maven Plugin to compile, test and package kotlin source
- Maven Shade Plugin to package the fat jar

Let's build and run the hello-kotlin examples
-----------------
```bash
mvn clean install
```
```bash
java -jar target/kotlin-api.jar Cybercom
```

Should render this:
```bash
Hello Cybercom
```

Hello Spark
-----------------
Let's replace the plain helloworld with hello spark!

```kotlin
import spark.Spark.*

fun main(args: Array<String>) {
    get("/hello/:name") { req, res -> "Hello ${req.params("name")}" }
}
```

Let's give it a go and run it in our browser.
Access on port 4567, the default sparkjava port.
```
http://localhost:4567/hello/you
```
