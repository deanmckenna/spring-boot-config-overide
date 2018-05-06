### Overriding Spring boot configuration properties

- Build Jar:

```
mvn install
```

- Navigate into target directory and execute Jar from terminal overriding the config.message property:

```
java -Dconfig.message="Hello from override" -jar my-service.jar
```