#Dockerizacion de MsPedido
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} MsPedido-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","MsPedido-0.0.1-SNAPSHOT.jar" ]