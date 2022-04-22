package by.kirzh.studenthelper.repository;

import by.kirzh.studenthelper.domain.Comment;
import by.kirzh.studenthelper.domain.Educator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {


    List<Comment> findAllByEducator(Educator educator);
}
