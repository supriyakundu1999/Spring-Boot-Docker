# Spring-Boot-Docker
Spring Boot Project deployment in Docker


Steps To Deploy in Docker\
-> Maven install to build the jar\
-> Create the Docker file\
-> Command to build the Docker image: "docker image build -t spring-docker ."\
-> Command to run the container: "docker container run --name spring-test -p 8091:8091 -d spring-docker"