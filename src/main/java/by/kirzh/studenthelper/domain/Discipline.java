package by.kirzh.studenthelper.domain;


import javax.persistence.*;

@Entity
@Table
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long disciplineId;

    private String disciplineName;
    private String disciplineDescription;

    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Educator educator;

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

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }
}
