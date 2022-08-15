package ru.ivos.avito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivos.avito.models.Image;


/**
 * @author iVos 20.07.2022
 */
public interface ImageRepository extends JpaRepository<Image, Long> {
}
