FROM openjdk:8
EXPOSE 8080
ADD target/Festival.jar Festival.jar
ENTRYPOINT ["java","-jar","/Festival.jar"]