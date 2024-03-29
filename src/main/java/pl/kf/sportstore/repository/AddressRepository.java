package pl.kf.sportstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kf.sportstore.model.user.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findAddressByCityAndStreetAndHouseNumber(String city, String street, Integer houseNumber);
}
