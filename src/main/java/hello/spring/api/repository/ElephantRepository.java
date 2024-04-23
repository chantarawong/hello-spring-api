package hello.spring.api.repository;


import org.springframework.data.repository.CrudRepository;
import hello.spring.api.model.Elephant;

public interface ElephantRepository extends CrudRepository<Elephant, Long> {
}
