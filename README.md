This repository has three microservices which explains how we can use feing client with eureka server and eureka client via spring application name.

There are 3 microservices

1. Eureka Naming Server
2. First Microservice
3. Second Microservice

Description: 

Eureka Naming Server: 
This microservice is nothing but serving as Eureka server. The other two microservices will register to this microservice or eureka server

First microservice:
This application is register itself to eureka naming server 
It has a feign client which is used to call sayHi method from second microservice. Please note that in the feign client we are not passing the entire URL of second microservice. It is called via name of the second microservice. Since second microservice is also registered with eureka server, we do not have to give full URL of second microservice


Second microservice:
This application is register itself to eureka naming server 
It has a rest end point sayHi which would be called by first microservice via feign client.


