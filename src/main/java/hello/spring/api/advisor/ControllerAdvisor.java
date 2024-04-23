package hello.spring.api.advisor;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import hello.spring.api.exception.ElephantNotFoundException;
import hello.spring.api.model.Elephant;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ElephantNotFoundException.class)
    public ResponseEntity<Elephant> handleCatNotFound(ElephantNotFoundException exc, WebRequest req) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}