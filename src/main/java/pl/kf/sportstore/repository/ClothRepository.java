package pl.kf.sportstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kf.sportstore.model.products.cloth.Cloth;

import java.util.List;

@Repository
public interface ClothRepository extends JpaRepository<Cloth, Long> {

    Cloth findClothById(Long id);
}
