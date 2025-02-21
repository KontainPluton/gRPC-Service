# gRPC-Service

[![Language](https://shields.io:/github/languages/top/KontainPluton/gRPC-Service?color=007396&logo=java&logoColor=white&labelColor=bd7509&style=for-the-badge)](https://openjdk.java.net/)
![Maven](https://shields.io/badge/Use-Maven-C71A36?logo=Apache-Maven&logoColor=white&style=for-the-badge)
[![Api provided](https://shields.io/badge/API%20provided-gRPC-00afac?logo=grpc&logoColor=white&style=for-the-badge)](https://grpc.io/)

![IMT](https://shields.io/badge/Made%20at-IMT%20Mines%20Al%C3%A8s-00bcd7?logo=mines&logoColor=white&style=for-the-badge&labelColor=black)
![Contributor](https://shields.io:/github/contributors/KontainPluton/gRPC-Service?style=for-the-badge)
![GitHub last commit](https://shields.io:/github/last-commit/KontainPluton/gRPC-Service?style=for-the-badge)

*[Test project for a course at IMT]*

## Information

**Java** service with **Maven**.
This service implements a test gRPC API to query hotel rooms.

## Setup

### With Docker ![Docker](https://shield.lylium.fr/badge/-Docker-2496ED?logo=docker&logoColor=white&style=f&style=flat-square)

By default, this project is configured to run with docker.

To run project, you can choose to use the **docker-compose** file, or build manually images from the **DockerFile** of each service. (docker image are not stored on docker hub, you will have to build them with DockerFile first)

To build the grpc service image, you can follow the guide here : https://github.com/KontainPluton/gRPC-Service/blob/main/docker/createDockerImage.md

---

### Without Docker

#### **Requirements :**

- Have Java 1.8 (jdk) installed (https://openjdk.java.net/install/)
- Have Apache Maven installed (https://maven.apache.org/download.cgi)

#### **Build the gRPC-Service**

- Go into `java-grpc-server` folder.
- Run : `mvn clean`
- Run : `mvn install`

Into the `target` folder, you will find two jar file :
- `InfresGrpcWebService-1.0-jar-with-dependencies.jar` represents the gRPC server.
- `InfresGrpcWebService-1.0.jar` representes the gRPC client (for testing).

To run the server :

```
java -jar InfresGrpcWebService-1.0-jar-with-dependencies.jar
```


If you run the server part, you can access to it at : localhost:8070
