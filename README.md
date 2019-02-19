# Assignment: URL Shortener

## Description

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Mandatory Requirements

- Design and implement an API for short URL creation
- Implement forwarding of short URLs to the original ones
- There should be some form of persistent storage
- The application should be distributed as one or more Docker images

## Technologies

- Java 8
- Spring Boot 2.1.2.RELEASE
- Hibernate 5.3.7.Final
- REST API

## How to compile and run the application with an example for each call

Install: git clone https://github.com/thiaguimcavalcanti/url-shortener.git

Build: mvn package

Deploy: mvn spring-boot:run

## Examples for each call

http://localhost:8080/save?originalUrl={url}

http://localhost:8080/getById?id={id}

To facilitate the execution of the calls:

All the others are in the file "URL Shortener.postman_collection.json" in the "src/main/resources/static/postman/" folder. 
The file must be imported into the Postman (https://www.getpostman.com/) application. 
How-to: https://support.smartbear.com/readyapi/docs/testing/integrations/postman.html#importing-a-postman-collection