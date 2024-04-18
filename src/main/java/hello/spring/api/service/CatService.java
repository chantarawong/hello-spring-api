package hello.spring.api.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CatService {

    private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public OctoCat findById(long id) throws CatNotFoundException {

        Optional<OctoCat> oCat = catRepository.findById(id);

        if (oCat.isEmpty()) {
            throw new CatNotFoundException();
        }
        return oCat.get();
    }

    //write me a cat service method to find a cat by name with async method signature
    public ArrayList<OctoCat> findByName(String name) throws CatNotFoundException   {
        return catRepository.findByName(name);
    }



    public OctoCat findByName(String name) throws CatNotFoundException {

        Optional<OctoCat> oCat = catRepository.findByName(name);

        if (oCat.isEmpty()) {
            throw new CatNotFoundException();
        }
        return oCat.get();

    }

    //write me an SQL to update cat name by id
    public void updateNameById(String name, long id) {
        catRepository.updateNameById(name, id);
    } 
}