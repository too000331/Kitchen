FROM openjdk:8
COPY target/kitchen-0.0.1.jar kitchen-0.0.1.jar
ENTRYPOINT ["java","-jar","/kitchen-0.0.1.jar"]
EXPOSE 9091