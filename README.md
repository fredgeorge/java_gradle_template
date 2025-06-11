# Java Gradle Template (Java 21 / Gradle 8.14.2)

* Two modules: **engine** (implementation) and **tests** (depends on engine).
* Latest JUnit Jupiter 5.13.1 with matching JUnit Platform launcher 1.13.1.
* Built for Java 21 LTS
* Wrapper scripts have been committed here to ensure everything is here


```
./gradlew test      # macOS / Linux
gradlew.bat test    # Windows
```
Also, successfully loads into IntelliJ IDEA.