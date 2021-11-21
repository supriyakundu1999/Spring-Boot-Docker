From openjdk:15
copy ./target/spring_docker-0.0.1-SNAPSHOT.jar spring_docker-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","spring_docker-0.0.1-SNAPSHOT.jar"]