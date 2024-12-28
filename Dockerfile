FROM openjdk:17
ARG JAR_FILE=build/libs/jenkin.jar
COPY ${JAR_FILE} jenkin.jar
ENTRYPOINT ["java","-jar","/jenkin.jar"]