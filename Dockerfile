FROM openjdk:8
ADD /target/be-service-0.0.1-SNAPSHOT.jar be-service.jar
EXPOSE 8880
ENTRYPOINT ["java","-jar","be-service.jar"]