# RxDb
This repository purpose is to show and compare a simple REST service using a traditional Spring MVC + Spring Data JPA + JDBC vs Spring Webflux + Spring Data Reactive + R2DBC.

## master
In master branch you will find the traditional stack implementation and gatling script for a warmup test.

## webflux
This branch is the reactive approach. You'll find exactly the same functionality as in master but with a reactive approach (thus, "enclosures" api collection returns Flux instead of List).

## data
Data branch contains a single file with data to test the application. It's a PostgreSQL binary file, so you'll need an instance. I suggest use of Docker and then import it into your running Postgres container with something like this:

```docker run --rm --name pg-restore -v /data/:/media/backup -e PGPASSWORD=docker postgres pg_restore -h 172.17.0.4 -U postgres -d my-database /media/backup/sigpac```

Being:

* data: directory with the data file.
* PGPASSWORD: your PostgreSQL Docker container password.
* 172.17.0.4: your PostgreSQL Docker container ip.
* my-database: database in your PostgreSQL Docker container.

