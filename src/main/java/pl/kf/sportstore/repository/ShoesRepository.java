package pl.kf.sportstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kf.sportstore.model.products.shoes.Shoes;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Long> {
}
