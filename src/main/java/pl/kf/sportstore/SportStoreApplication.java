package pl.kf.sportstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.kf.sportstore.model.products.Discipline;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.products.cloth.ClothSize;
import pl.kf.sportstore.model.products.cloth.ClothType;
import pl.kf.sportstore.model.products.shoes.Shoes;
import pl.kf.sportstore.model.user.Address;
import pl.kf.sportstore.model.user.User;
import pl.kf.sportstore.repository.AddressRepository;
import pl.kf.sportstore.repository.ClothRepository;
import pl.kf.sportstore.repository.UserRepository;

@SpringBootApplication
public class SportStoreApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ClothRepository clothRepository;

    public static void main(String[] args) {
        SpringApplication.run(SportStoreApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address(1L, "Kozłowa", 28, 15868, "Białystok");
        User user = new User(1L, "kfalk", "kfalk", true, "Krzysztof", "Falkowski", address);
        //System.out.println(user);
        addressRepository.save(address);
        userRepository.save(user);

        Cloth tShirt = new Cloth("Nike", "Best001", Discipline.FOOTBALL, 99.99D, 11);
        tShirt.setClothSize(ClothSize.L);
        tShirt.setClothType(ClothType.T_SHIRT);
        clothRepository.save(tShirt);
        //System.out.println(tShirt);

        //System.out.println(tShirt.getDiscipline().toString());
    }
}
