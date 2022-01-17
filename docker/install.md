# HELP ME

- You need to build `java-restserver.war`. Go in java-restserver folder.

```
mvn clean
mvn install
```

- In `java-restserver/target` you will find a java-reserver.war.

- Move this file into docker folder.

```
    docker build -f .\restApi.DockerFile . -t bookme
```
