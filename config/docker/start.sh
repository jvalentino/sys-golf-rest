#!/bin/bash
cd /usr/local
echo 4
java -jar -Dspring.datasource.url=jdbc:postgresql://pg-primary-postgresql:5432/examplesys sys-golf-rest-0.0.1.jar
