FROM maven
#RUN useradd -m -u 1000 -s /bin/bash jenkins
COPY . /src
WORKDIR /src
#RUN yum install -y openssh-clients
