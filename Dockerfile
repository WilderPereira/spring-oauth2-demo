FROM frolvlad/alpine-oraclejdk8:slim
EXPOSE 8081
RUN mkdir -p /app/
ADD build/libs/authServer-0.0.1-SNAPSHOT.jar /app/authServer.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/authServer.jar"]