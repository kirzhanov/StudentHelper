package by.kirzh.studenthelper.domain;


import javax.persistence.*;

@Entity
@Table(name = "discipline")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "discipline_id", insertable = false,updatable = false)
    private Long disciplineId;

    private String disciplineName;
    private String disciplineDescription;

    public Discipline() {
        //JPA
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public String getDisciplineDescription() {
        return disciplineDescription;
    }

    public void setDisciplineDescription(String disciplineDescription) {
        this.disciplineDescription = disciplineDescription;
    }
}
