package by.kirzh.studenthelper.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseId;

    private String courseShortName;
    private String courseName;
    private String courseDescription;

    @ManyToOne
    private Educator educator;

    public Course() {
        //JPA
    }
}
