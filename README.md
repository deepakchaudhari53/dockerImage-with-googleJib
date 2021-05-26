### dockerImage-with-googleJib
 create and push dockerImage using google Jib plugin

#### Motivation
Let's say we have a Java Spring Boot app which is an amazing new app, that we know how to run locally. That's all well and good, but unfortunately running it locally won't help us to make the app available to any prospective clients. 
We want to enable this app to be built into a Docker image, so that we can run the application inside of our Kubernetes namespace (i.e. in Fabric). 

The usual process for doing this would be to:

Download all of our app's dependencies

Compile the app and build an executable .jar file

Place this .jar file inside of a Docker image

Deploy the Docker image with all of the necessary secrets and configs, so that we have our application running inside of a Pod in Fabric

This process is handled in our build pipeline via Jenkins, and fortunately for us Google have developed a tool called Jib which can be used to execute some of the steps above...

#### What is Jib?
Jib is a Maven plugin developed by Google (they also have a Gradle version). It is used to containerise your Java Spring Boot application and push it to a Docker registry.
google Jib - https://cloud.google.com/java/getting-started/jib

Thus, Jib removes the need for a Dockerfile, and Jib removes the need to have Docker installed locally, a key requirement for us!

####  Using Jib locally
The following steps can be used to build a Docker image out of a branch that you have checked out locally, and push this image to your Fabric namespace. 
It is a useful process. For example when we refactored the Logo Service Jav app, we built a second version of our application (the refactored version) using Jib, so that we could test the refactored app before raising a pull request.

#### Maven Commands - 
Below are the commands to create & push docker images for below microservices - 

###### app-feed - 
    mvn clean install -DskipJibFeed=false
###### app-service -  
    mvn clean install -DskipJibService=false
    
Docker Url - https://hub.docker.com/repository/docker
    