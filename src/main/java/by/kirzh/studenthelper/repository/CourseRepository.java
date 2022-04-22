package by.kirzh.studenthelper.repository;

import by.kirzh.studenthelper.domain.Course;
import by.kirzh.studenthelper.domain.Educator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByEducator(Educator educator);
}
