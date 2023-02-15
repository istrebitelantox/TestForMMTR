FROM jenkins/jenkins:lts-jdk11
#RUN useradd -m -u 1000 -s /bin/bash jenkins
COPY . /src
WORKDIR /src

RUN mvn package
#RUN yum install -y openssh-clients
