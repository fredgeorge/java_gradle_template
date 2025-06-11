# Java Gradle Template (Java 21 / Gradle 8.14.2)

* Two modules: **engine** (implementation) and **tests** (depends on engine).
* Latest JUnit Jupiter 5.13.1 with matching JUnit Platform launcher 1.13.1.
* Wrapper *scripts* are **not** committed here to keep the ZIP compact.
  Generate them once with **Gradle 8.14.2**:

```bash
gradle wrapper --gradle-version 8.14.2
```

That will create `gradlew`, `gradlew.bat`, and download the small
`gradle-wrapper.jar`. From then on, simply run:

```bash
./gradlew test      # macOS / Linux
gradlew.bat test    # Windows
```
