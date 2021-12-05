From alpine:3.14.2

RUN apk update && apk add openjdk11 libc6-compat

# Create a group and user
RUN addgroup -S configuration-server-apps && adduser --disabled-password -S itsp-config-user -G configuration-server-apps

USER itsp-config-user

RUN mkdir -p ~/profiles-repo && mkdir -p ~/itsp-profiles-gui-app
COPY target/WebApp-1.0-SNAPSHOT.jar /home/itsp-config-user/itsp-profiles-gui-app/WebApp-1.0-SNAPSHOT.jar

ENV PROFILES_PATH=/home/itsp-config-user/profiles-repo/profiles/

# Use the _JAVA_OPTIONS environment variable to configure the logging level
ENV _JAVA_OPTIONS=-Dlogging.level.root=INFO

WORKDIR /home/itsp-config-user/
EXPOSE 8080

ENTRYPOINT ["java","-jar","itsp-profiles-gui-app/WebApp-1.0-SNAPSHOT.jar"]
