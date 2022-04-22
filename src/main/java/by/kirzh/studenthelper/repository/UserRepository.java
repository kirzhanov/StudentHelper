package by.kirzh.studenthelper.repository;

import by.kirzh.studenthelper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
