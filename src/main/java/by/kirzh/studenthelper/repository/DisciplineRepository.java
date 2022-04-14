package by.kirzh.studenthelper.repository;

import by.kirzh.studenthelper.domain.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, Long> {
}
