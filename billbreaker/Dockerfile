FROM openjdk:17

COPY /target/billbreaker_app.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "billbreaker_app.jar"]