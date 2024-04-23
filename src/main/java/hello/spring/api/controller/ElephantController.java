package hello.spring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hello.spring.api.model.Elephant;
import hello.spring.api.service.ElephantService;

@RestController
public class ElephantController {

    private ElephantService elephantService;

    public ElephantController (ElephantService elephantService) {
        this.elephantService = elephantService;
    }

    @GetMapping("/api/cat/{id}")
    public Elephant getCatById(@PathVariable long id) throws Exception {
        return elephantService.findById(id);
    }


}