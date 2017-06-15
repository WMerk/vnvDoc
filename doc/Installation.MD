![vnv][]
# Installation guide

## Requirements
### OS
The java application can run on any common OS. However we suggest to use a linux distribution. This installation guide assumes you are trying to install vnv on a linux (debian) system.

### Java 8
#### Java 8 on Debian 8

Add the line ```deb http://httpredir.debian.org/debian jessie-backports main``` to a file with the ".list" extension in /etc/apt/sources.list.d/. Then do ``` sudo apt-get update ```.
```
$ echo "deb http://httpredir.debian.org/debian jessie-backports main" | sudo tee -a /etc/apt/sources.list.d/jessie-backports.list
$ sudo apt-get update
$ sudo apt-get install -t jessie-backports  openjdk-8-jre-headless ca-certificates-java
$ sudo apt-get install openjdk-8-jdk
```

#### Java 8 on Ubuntu 14.04

Users on Ubuntu 14.04 can add oracle Java 8 via webupd8. Note that when installing from webupd8 or any other PPA, you must install Java 8 manually before installing Neo4j. Otherwise there is a risk that Java 9 will be installed in, which is not compatible with Neo4j.
```
$ sudo add-apt-repository ppa:webupd8team/java
$ sudo apt-get update
$ sudo apt-get install oracle-java8-installer
```
Once installed, see the section called “Dealing with multiple installed Java versions”.

##### Dealing with multiple installed Java versions

It is important that you configure your default Java version to point to Java 8. Do so with the update-java-alternatives command.

First list all your installed version of Java with ```$ update-java-alternatives --list```

Your result may vary, but this is an example of the output:
```
java-1.7.0-openjdk-amd64 1071 /usr/lib/jvm/java-1.7.0-openjdk-amd64
java-1.8.0-openjdk-amd64 1069 /usr/lib/jvm/java-1.8.0-openjdk-amd64
```
Identify your Java 8 version, in this case it is java-1.8.0-openjdk-amd64. Then set it as the default with (replacing <java8name> with the appropriate name from above)

```
$ sudo update-java-alternatives --jre --set <java8name>
```
### Maven

```
$ sudo apt-get install maven
```

### Docker

see https://docs.docker.com/engine/installation/linux/debian/

## Download source code
You have to get the source code from this repository https://github.com/WMerk/vnv. You can download it manually or using git:
```
$ git clone git@github.com:WMerk/vnv.git
```
After that you shall change into this directory:
```
$ cd vnv/
```

## Configuration
Configurations can be done in the application.properties file. 
Please provide correct passwords for the databases. 
The active profile shall be "prod" and "prod" only.

## Installation
### Databases
#### redis

```
$ docker run --name vnv_redis -p 6379:6379 -d redis redis-server --appendonly yes --requirepass password
```

#### neo4j

``` 
$ docker run \
    --publish=7474:7474 --publish=7687:7687 \
    --volume=$HOME/neo4j/data:/data \
    --volume=$HOME/neo4j/logs:/logs \
    neo4j:3.0 
```
	
By default Neo4j requires authentication. You have to login through your browser to localhost:7474 with neo4j/neo4j at the first connection and set a new password.

### Build it
```
$ mvn install
```

This can take some time.

## Run it

```
$ java -Dserver.address=127.0.0.1 -Dserver.port=8080 -jar target/vnv-project-<version>.jar
```


[vnv]: https://raw.githubusercontent.com/WMerk/vnvDoc/master/logo/logo_wide_big.png "vnv logo"
