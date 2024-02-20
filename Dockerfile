FROM eclipse-temurin:21-jdk-alpine as base
RUN apk add bash
SHELL ["/bin/bash", "-c"]
WORKDIR /var/app/
COPY . .
