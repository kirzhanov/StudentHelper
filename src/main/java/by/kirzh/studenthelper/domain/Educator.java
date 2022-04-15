package by.kirzh.studenthelper.domain;

import javax.persistence.*;

@Entity
@Table(name = "educator")
public class Educator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "educator_id")
    private Long educatorId;

    private String firstName;
    private String lastName;
    private String middleName;

    private String email;

    public Educator() {
        //JPA
    }

    public Long getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(Long educatorId) {
        this.educatorId = educatorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
