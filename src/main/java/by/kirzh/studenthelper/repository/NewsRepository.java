package by.kirzh.studenthelper.repository;

import by.kirzh.studenthelper.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
