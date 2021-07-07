# spring-boot-java-basic-archetype

## How to use?

This archetype is published to Maven central. 
You can generate projects using this archetype with `mvn archetype:generate` and select the archetype number.

### Install archetype locally

```
git clone https://github.com/himankbatra/spring-boot-base-archetype.git
cd spring-boot-base-archetype
./mvnw clean install
```

### Generate application from archetype

```
mvn archetype:generate \
    -B -DarchetypeGroupId=io.github.himankbatra.archetypes \
    -DarchetypeArtifactId=spring-boot-base-archetype \
    -DarchetypeVersion=0.0.1-SNAPSHOT \
    -DgroupId=com.mycompany \
    -DartifactId=myapp \
    -Dversion=1.0-SNAPSHOT \
    -Dpackage=com.mycompany.myapp
```


## Developer Notes

Procedure for deploying to Maven Central https://central.sonatype.org/pages/apache-maven.html

Create or update archetypes and set version to SNAPSHOT (ex: 1.0.0-SNAPSHOT)

Deploy SNAPSHOT version to https://oss.sonatype.org/content/repositories/snapshots/

`spring-boot-java-basic-archetype> mvn clean deploy -P release`

Deploy release version to Maven Central

```
spring-boot-java-basic-archetype> mvn release:clean release:prepare  -P release
spring-boot-java-basic-archetype> mvn release:perform  -P release
```
