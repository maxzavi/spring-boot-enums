# Java Spring Boot Sample enums using maven

Create Spring Boot project with maven, add starters:

- Lombok


Implements **CommandLineRunner** and add **run** method

```java
public class DemoenumsApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
```

Add logging using **slf4j**

```java
public class DemoenumsApplication implements CommandLineRunner {
    //Logger
	private final static Logger LOG = LoggerFactory.getLogger(DemoenumsApplication.class);
```
Settings in **application.properties** file:

```properties
#Logger
logging.level.root=INFO
logging.level.pe=DEBUG
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1} - %m%n
```
