#!/bin/bash

java  -jar app.jar \
      --server.port="8080" --spring.profiles.active=local
