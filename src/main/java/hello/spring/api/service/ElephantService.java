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

    
    public Elephant list() throws ElephantNotFoundException {

        Iterable<Elephant> iElephants = elephantRepository.findAll();

         if (iElephants.iterator().hasNext()) {

            //update name of first elephant
            Elephant e = iElephants.iterator().next();
            e.setSalary(9000);
            return e;

        } else {
            throw new ElephantNotFoundException();
        }
    }
}