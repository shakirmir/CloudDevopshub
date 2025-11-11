### jenkins
- install Jenkins on ubuntu
- follow the instructions in the link below - 
- https://www.jenkins.io/doc/book/installing/linux/#debian
- select the option install suggested pluggins otherwise git and other pluggins will not be available we might get error while git integration

- un: admin
- pwd: admin    
## Manual aaproach 
## this is example link for freestyle project in git 
- https://github.com/DevSecOpsG/helloworldsimplejavaprogram.git

### exceute shell in build step
- javac helloworld.java
- java Simple

### install full java 
- sudo apt-get update
- sudo apt-get install -y openjdk-21-jdk

## Automated approach enable trigger
- add a cron job in Poll scm
- * * * * * [every min will check for any code update]
-----------------
DIfference between compile and build
compile - class file
build - jar file

##
### Freestyle job - no script
everything we need to perform manually in the job
### pipeline job - groovy script
we need to perform using groovy sript




