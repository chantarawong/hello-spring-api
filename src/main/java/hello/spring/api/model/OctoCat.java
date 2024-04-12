package hello.spring.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class OctoCat {

    @Id
    private long id;

    private String name;

    private CatType type;

}