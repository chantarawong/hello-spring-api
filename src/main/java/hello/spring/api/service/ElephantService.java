package hello.spring.api.service;

import org.springframework.stereotype.Service;

import hello.spring.api.exception.ElephantNotFoundException;
import hello.spring.api.model.Elephant;
import hello.spring.api.repository.ElephantRepository;

import java.util.Optional;

@Service
public class ElephantService {

    private ElephantRepository elephantRepository;

    public ElephantService(ElephantRepository elephantRepository) {
        this.elephantRepository = elephantRepository;
    }

    public Elephant findById(long id) throws ElephantNotFoundException {

        Optional<Elephant> oElephant = elephantRepository.findById(id);

        if (oElephant.isEmpty()) {
            throw new ElephantNotFoundException();
        }
        return oElephant.get();
    }
}