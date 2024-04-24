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


  //copilot please eliminate cross site script below method
 
  @GetMapping("/echo")
  public String echo(String word){

    //call sanitizeString method
    word = this.sanitizeString(word);
    return "Echo: " + word;
  }

  //create a private method to sanitize string
  private String sanitizeString(String word){

    //remove a html tag from word
    word = word.replaceAll("<", "&lt;");
    word = word.replaceAll(">", "&gt;");
    
    return word;

  }
  

}