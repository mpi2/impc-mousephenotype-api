# IMPC Web API

Web API for the website mousephenotype.org.

## How to run?

### Requirements 

- Docker
- docker-compose
- Create a directory called `db-dump`  and get the data from our [FTP site](https://ftp.ebi.ac.uk/pub/databases/impc/all-data-releases/release-16.0/impc-bulk-data-api-mongodb/).

### Bootstrap your MongoDB database

Run:

`docker-compose up mongo`

This is going to take a while, specially for the Experimental Data collection. After the restore is complete both for collections and Indexes you can stop the mongo service using `Ctrl+C`.

### Run the whole service

Run:

`docker-compose up`

### Check that the service is up and running

Go to [http://localhost:8080/geneBundles/MGI:1929293](http://localhost:8080/geneBundles/MGI:1929293).

## How to contribute?

