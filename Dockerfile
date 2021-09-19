FROM openjdk:11
VOLUME [ "/tmp" ]
ADD ./target/users-0.0.1-SNAPSHOT.jar users.jar
ENTRYPOINT [ "java", "-jar", "users.jar" ]