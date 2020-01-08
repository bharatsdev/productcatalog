#BaseImage
FROM openjdk:8-jre-alpine

MAINTAINER  everythingisdata.githib.io 

COPY . /var/shopping
WORKDIR /var/shopping


 ENTRYPOINT ["java" ,"-jar","target/OnlineShopping-0.0.1-SNAPSHOT.jar"]

#On port application will listing
EXPOSE 8080 8080