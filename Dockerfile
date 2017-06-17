From java:8
EXPOSE 8080
ADD /build/libs/zull-0.1.0.jar  zull-0.1.0.jar
ENTRYPOINT ["java","-jar","zull-0.1.0.jar"]