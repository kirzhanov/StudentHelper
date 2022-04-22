package by.kirzh.studenthelper.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "educator")
public class Educator {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "educator_id")
    private Long educatorId;

    private String firstName;
    private String lastName;
    private String middleName;

    private String email;

    public Educator() {
        //JPA
    }

}
