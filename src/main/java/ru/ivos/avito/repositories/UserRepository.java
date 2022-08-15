package ru.ivos.avito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivos.avito.models.User;

/**
 * @author iVos 20.07.2022
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
