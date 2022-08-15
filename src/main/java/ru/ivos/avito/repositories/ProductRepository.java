package ru.ivos.avito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivos.avito.models.Product;

import java.util.List;

/**
 * @author iVos 19.07.2022
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByTitle (String title);
}
