package by.kirzh.studenthelper.service;

import by.kirzh.studenthelper.domain.Comment;
import by.kirzh.studenthelper.domain.Course;
import by.kirzh.studenthelper.domain.Educator;
import by.kirzh.studenthelper.dto.EducatorWithCoursesAndCommentsDto;
import by.kirzh.studenthelper.repository.CommentRepository;
import by.kirzh.studenthelper.repository.CourseRepository;
import by.kirzh.studenthelper.repository.EducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentHelperService {

    CommentRepository commentRepository;
    CourseRepository courseRepository;
    EducatorRepository educatorRepository;

    @Autowired
    public StudentHelperService(CommentRepository commentRepository,
                                CourseRepository courseRepository,
                                EducatorRepository educatorRepository) {
        this.commentRepository = commentRepository;
        this.courseRepository = courseRepository;
        this.educatorRepository = educatorRepository;
    }

    public List<EducatorWithCoursesAndCommentsDto> getAllEducatorsWithCoursesAndComments() {

        List<EducatorWithCoursesAndCommentsDto> result = new ArrayList<>();

        List<Educator> educators = educatorRepository.findAll();
        for (Educator educator : educators) {
            List<Course> courses = courseRepository.findAllByEducator(educator);
            List<Comment> comments = commentRepository.findAllByEducator(educator);
            result.add(new EducatorWithCoursesAndCommentsDto(educator, courses, comments));
        }

        return result;
    }
}
