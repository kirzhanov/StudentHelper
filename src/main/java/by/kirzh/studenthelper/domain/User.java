package by.kirzh.studenthelper.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@Embeddable
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String name;
    private String email;


}
