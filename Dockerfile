FROM openjdk:8u181-jre-alpine3.8
EXPOSE 8080
COPY ./target/application.jar /app/
CMD ["java","-jar","/app/application.jar"]