FROM maven:3-openjdk-11-slim as build

COPY pom.xml /usr/src/impc-mousephenotype-api/
COPY src /usr/src/impc-mousephenotype-api/src

RUN mvn -f /usr/src/impc-mousephenotype-api/pom.xml clean package -P test

# The final image should have a minimal number of layers
FROM openjdk:11-jre-slim-buster

VOLUME /tmp

COPY  --from=build /usr/src/impc-mousephenotype-api/target/*.jar app.jar
COPY docker-scripts/start.sh /

RUN ["chmod", "+x", "/start.sh"]

ENTRYPOINT ["/start.sh"]
