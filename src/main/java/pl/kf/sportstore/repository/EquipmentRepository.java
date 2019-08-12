package pl.kf.sportstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kf.sportstore.model.products.equipment.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    Equipment findEquipmentById(Long id);
}
