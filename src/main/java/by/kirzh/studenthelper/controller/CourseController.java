package by.kirzh.studenthelper.controller;

import by.kirzh.studenthelper.domain.Course;
import by.kirzh.studenthelper.repository.CourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "courses")
public class CourseController {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("{courseId}")
    public Course getCourse(@PathVariable("courseId") Course course){
        return courseRepository.getById(course.getCourseId());
    }

    @PostMapping
    @SuppressWarnings("S4684")
    //TODO: Replace entity to DTO
    public Course createCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @PutMapping("{courseId}")
    @SuppressWarnings("S4684")
    //TODO: Replace entity to DTO
    public Course updateCourse(@PathVariable("courseId") Course courseToUpdate, @RequestBody Course newCourse) {
        BeanUtils.copyProperties(newCourse, courseToUpdate, "courseId");
        return courseRepository.save(courseToUpdate);
    }

    @DeleteMapping("{courseId}")
    public void deleteCourse(@PathVariable("courseId") Course courseToDelete){
        courseRepository.delete(courseToDelete);
    }
}
