package by.kirzh.studenthelper.dto;

import by.kirzh.studenthelper.domain.Comment;
import by.kirzh.studenthelper.domain.Course;
import by.kirzh.studenthelper.domain.Educator;
import lombok.Data;

import java.util.List;

@Data
public class EducatorWithCoursesAndCommentsDto {

    private Educator educator;
    private List<Course> courses;
    private List<Comment> comments;

    public EducatorWithCoursesAndCommentsDto(Educator educator, List<Course> courses, List<Comment> comments) {
        this.educator = educator;
        this.courses = courses;
        this.comments = comments;
    }
}
