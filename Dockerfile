FROM amazoncorretto:17-alpine3.18

WORKDIR usr/local/bin

EXPOSE 8080

COPY ./target/javatest-0.0.1-SNAPSHOT.jar javatest.jar

CMD ["java", "-jar", "javatest.jar"]