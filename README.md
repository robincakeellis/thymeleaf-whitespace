# THYMELEAF WHITE SPACE

A working Java project that uses Spring Boot and Thymeleaf to return compact HTML content. Configurable with application properties and with build-time tests.

Read more about this project at [Medium.com](TODO) 

## Building

`mvn clean install`

## Running

`java -jar target/thymeleafwhitespace-0.0.1-SNAPSHOT.jar`

## Example

`curl -i http://localhost:8080/` - gets the example page. Note the lack of white space in `head` for example

## Original code

This project uses a handler and processor based on this Thymeleaf-related [Github post](https://github.com/thymeleaf/thymeleaf/issues/108#issuecomment-761724887) from **Yamani Rodriguez**.