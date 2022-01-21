# gRPC-Service

[![Language](https://shield.lylium.fr:/github/languages/top/KontainPluton/gRPC-Service?color=007396&logo=java&logoColor=white&labelColor=bd7509&style=for-the-badge)](https://openjdk.java.net/)
![Maven](https://shield.lylium.fr/badge/Use-Maven-C71A36?logo=Apache-Maven&logoColor=white&style=for-the-badge)
[![Api provided](https://shield.lylium.fr/badge/API%20provided-gRPC-00afac?logo=grpc&logoColor=white&style=for-the-badge)](https://grpc.io/)

![IMT](https://shield.lylium.fr/badge/Made%20at-IMT%20Mines%20Al%C3%A8s-00bcd7?logo=mines&logoColor=white&style=for-the-badge&labelColor=black)
![Contributor](https://shield.lylium.fr:/github/contributors/KontainPluton/gRPC-Service?style=for-the-badge)
![GitHub last commit](https://shield.lylium.fr:/github/last-commit/KontainPluton/gRPC-Service?style=for-the-badge)

*[Test project for a course at IMT]*

## Information

**Java** service with **Maven**.
This service implements a test gRPC API to query hotel rooms.

## Setup

### With Docker ![Docker](https://shield.lylium.fr/badge/-Docker-2496ED?logo=docker&logoColor=white&style=f&style=flat-square)

By default, this project is configured to run with docker. You will only have to run the **docker-compose** file, or the **DockerFile** of the rest server and keycloak server. (docker image are not stored on docker hub, you will have to build them with DockerFile first)

---

### Without Docker

#### **Requirements :**

- Have Java 1.8 (jdk) installed (https://openjdk.java.net/install/)
- Have Apache Maven installed (https://maven.apache.org/download.cgi)


You also will have to change the environment variable **USE_DOCKER** in Environment.java to false and eventualy change the grpc server adress
