package hello.spring.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Elephant {

    @Id
    private long id;

    private String name;

    private int salary;

}