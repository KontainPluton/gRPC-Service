# Create docker image with DockerFile

- You need to build `InfresGrpcWebService-1.0-jar-with-dependencies.jar`. Go in java-grpc-server folder.

```
mvn clean
mvn install
```

- In `java-grpc-server/target` you will find a InfresGrpcWebService-1.0-jar-with-dependencies.jar.

- Move this file into docker folder.

```
    docker build -f .\Dockerfile . -t grpc
```
