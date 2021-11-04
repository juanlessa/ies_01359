
## validate Tomcat is running 
    i)
    Curl tool
    $ curl -I 127.0.0.1:8080
    ii) Access the default page in the browser: http://localhost:8080
    iii) Observe the server log:
    $ tail logs/catalina.out



## Review Question 
A. What are the responsibilities/services of a “servlet container”?

// It can handle web request/responses. It can respond to many types of requests, they most commonly implement web containers for hosting web applications on web servers and thus qualify as a server-side servlet web API.


B. Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve
web content. (You may exemplify with the context of the previous exercises.)

// Specifically, Spring MVC is a versatile framework to treat web resquests, intermediating http requests and processing/parsing incoming data from those requests. Basically, after the user requests using the url to a web server (like Tomcat), Spring MVC's Controller Servelt will parse, process and search data, like the header and find the class that was implement to handle the request.


C. Inspect the POM.xml for the previous Spring Boot projects. What is the role of the “starters” dependencies?

// Starter POMs are a set of convenient dependency descriptors that you can include in your application


D. Which annotations are transitively included in the @SpringBootApplication?


E. Search online for the topic “Best practices for REST API design”. From what you could learn,
select your “top 5” practices, and briefly explain them in you own words.

// 1. Use JSON as a data format - JavaScript Object notation is a most-used notation to specify data. Most frameworks and convetions deal with this type as it is widely used.

2. Use Nesting - nesting data is a must-have form os data managment. It facilitates the access to data that is logically linked to it's parent.

3. Error Handling - Regular HTTP codes must be always used in any request for your API. They are easy to read for the machine and even to humans. easing debugging for everyone

4. Versioning - When changing information and methods for your API (that it's going to be inevitable), you must seggregate versions to increase compatibility and understanding.

5. Documentation - maintanence must be documented not just for you, but every other user to keep track of any change. 



