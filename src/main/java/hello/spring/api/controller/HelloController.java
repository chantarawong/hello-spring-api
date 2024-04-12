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

  //create a controller method to echo back the input string
  //http://localhost:8080/echo?word=Hello
  //I dont like an input variable name "input"
  @GetMapping("/echo")
  public String echo(String word){
    return "You said: " + word;
  }


  

  //please use the following URL to test the echo method  
  //http://localhost:8080/echo?word=Hello
  //http://localhost:8080/echo?word=Goodbye
  //http://localhost:8080/echo?word=Good%20Morning
  //http://localhost:8080/echo?word=Good%20Afternoon
  //http://localhost:8080/echo?word=Good%20Evening
  //http://localhost:8080/echo?word=Good%20Night
  //http://localhost:8080/echo?word=Good%20Day
  //http://localhost:8080/echo?word=Good%20Luck

  //create a unit test for the echo method
  // public static void main(String[] args) {
  //   HelloController controller = new HelloController();
  //   System.out.println(controller.echo("Hello"));
  //   System.out.println(controller.echo("Goodbye"));
  //   System.out.println(controller.echo("Good Morning"));
  //   System.out.println(controller.echo("Good Afternoon"));
  //   System.out.println(controller.echo("Good Evening"));
  //   System.out.println(controller.echo("Good Night"));
  //   System.out.println(controller.echo("Good Day"));
  //   System.out.println(controller.echo("Good Luck"));
  // }

  // // create a test driver to test the HelloWorld method
  // public static void main(String[] args) {
  //   HelloController controller = new HelloController();
  //   System.out.println(controller.HelloWorld());
  // }



}