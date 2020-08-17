FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=build/libs/spring-boot-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-boot-0.0.1-SNAPSHOT.jar"]