#Dockerizacion de MsVenta
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} MsVenta-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","MsVenta-0.0.1-SNAPSHOT.jar" ]