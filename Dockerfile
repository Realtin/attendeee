FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/attendeee.jar /attendeee/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/attendeee/app.jar"]
