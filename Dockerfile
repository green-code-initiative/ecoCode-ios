FROM sonarqube:10.5.0-community
USER root
ADD https://github.com/insideapp-oss/sonar-apple/releases/download/0.5.0/sonar-apple-plugin-0.5.0.jar /opt/sonarqube/extensions/plugins/sonar-apple-plugin-0.5.0.jar
RUN chmod 777 /opt/sonarqube/extensions/plugins/sonar-apple-plugin-0.5.0.jar
USER sonarqube