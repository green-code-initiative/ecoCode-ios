ARG MAVEN_BUILDER=3-openjdk-17-slim
#ARG SONARQUBE_VERSION=24.12.0.100206-community
ARG SONARQUBE_VERSION=10.5.0-community

FROM maven:${MAVEN_BUILDER} AS builder

COPY . /usr/src/creedengo

WORKDIR /usr/src/creedengo
COPY sonar-ios-plugin/src src/
COPY pom.xml tool_build.sh ./

RUN ./tool_build.sh

FROM sonarqube:${SONARQUBE_VERSION}
USER root
ADD https://github.com/insideapp-oss/sonar-apple/releases/download/0.5.0/sonar-apple-plugin-0.5.0.jar /opt/sonarqube/extensions/plugins/sonar-apple-plugin-0.5.0.jar
RUN chmod 777 /opt/sonarqube/extensions/plugins/sonar-apple-plugin-0.5.0.jar
COPY --from=builder /usr/src/creedengo/sonar-ios-plugin/target/creedengo-*.jar /opt/sonarqube/extensions/plugins/
USER sonarqube
