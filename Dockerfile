FROM selenium/standalone-chrome
COPY . /usr/bin
FROM maven:3.6.0