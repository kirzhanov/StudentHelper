package by.kirzh.studenthelper.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long commentId;

    private String commentBody;

    @ManyToOne(targetEntity = Educator.class)
    private Educator educator;

    @OneToOne()
    private User author;

    private LocalDateTime createdAt;

    public Comment() {
        //JPA
    }
}
