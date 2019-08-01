FROM tomcat:alpine
MAINTAINER Test User
WORKDIR $JENKINS_HOME/workspace/deployment_pipeline/
COPY UnitTestingNAGP-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
RUN chmod -R 777 /usr/local/tomcat/webapps/UnitTestingNAGP-0.0.1-SNAPSHOT.war
EXPOSE 8080
CMD /usr/local/tomcat/bin/catalina.sh run