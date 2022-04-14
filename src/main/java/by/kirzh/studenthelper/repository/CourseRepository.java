package by.kirzh.studenthelper.repository;

import by.kirzh.studenthelper.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
