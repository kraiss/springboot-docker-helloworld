FROM maven:3-jdk-8-alpine AS BUILD_IMAGE
RUN mkdir -p /root/build/src
COPY pom.xml /root/build
COPY src /root/build/src/
RUN mvn package -f /root/build/pom.xml

FROM openjdk:8-jre-alpine
COPY --from=BUILD_IMAGE /root/build/target/application.jar .
EXPOSE 8080
CMD ["java","-jar","application.jar"]