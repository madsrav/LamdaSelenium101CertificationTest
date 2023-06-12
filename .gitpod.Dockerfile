FROM maven:3.8.3-openjdk-11

RUN apt-get update && \
    apt-get install -y openjdk-11-jdk

COPY . /workspace

WORKDIR /workspace
