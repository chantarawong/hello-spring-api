package hello.spring.api.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String HelloWorld(){

    var localDateTime = LocalDateTime.now();
    return "Hello World with Java Spring Boot - Maven at " + localDateTime.toString();
  }

  @GetMapping("/echo")
  public String echo(String word){
    return "You said: " + word;
  }

}