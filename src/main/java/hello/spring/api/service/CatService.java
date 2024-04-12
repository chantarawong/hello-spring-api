package hello.spring.api.service;

import org.springframework.stereotype.Service;

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
}