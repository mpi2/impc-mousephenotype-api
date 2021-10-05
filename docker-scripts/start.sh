#!/bin/bash

java  -Dhttps.proxyHost=hx-wwwcache.ebi.ac.uk \
      -Dhttps.proxyPort=3128 \
      -Dhttp.proxyHost=hx-wwwcache.ebi.ac.uk \
      -Dhttp.proxyPort=3128 \
      -Dhttp.nonProxyHosts=*.ebi.ac.uk\|localhost\|127.0.0.1 \
      -Dftp.proxyHost=hx-wwwcache.ebi.ac.uk \
      -Dftp.proxyPort=3128 \
      -Dftp.nonProxyHosts=*.ebi.ac.uk\|localhost\|127.0.0.1 \
      -jar app.jar \
      --server.port="8080" --spring.profiles.active=docker
