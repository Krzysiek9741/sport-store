package pl.kf.sportstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
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
import pl.kf.sportstore.service.ProductService;
import pl.kf.sportstore.service.UserService;

@SpringBootApplication
@EnableJpaRepositories
public class SportStoreApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ClothRepository clothRepository;

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(SportStoreApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        /*productService.addNewEquipment("Nike", "Scotty", Discipline.BASKETBALL, 74.99D,
                "https://www.geo.tv/assets/uploads/updates/2018-02-24/183421_8317334_updates.jpg",
                115, "Ball", "Size: 5, outdoor/indoor" );
        productService.addNewEquipment("Adidas", "Eagles", Discipline.FOOTBALL, 69.99D,
                "https://sport.informator.news/wp-content/uploads/sites/5/2018/09/photo_2018-09-01_20-09-37.jpg",
                89, "Ball", "Size: 5, outdoor/indoor" );
        productService.addNewEquipment("Puma", "Lewy", Discipline.FOOTBALL, 24.99D,
                "https://pbs.twimg.com/media/CH4CGWWWcAAVHXG.jpg",
                29, "Shin guard", "Size: universal, for amateurs" );
        productService.addNewEquipment("Romet", "Lang", Discipline.CYCLING, 599.99D,
                "https://i2.skapiec.pl/1/D-tktkpTURBXy9kYWE1NWU0OGZmYzAzNTYyYTllZWQ5MmNjY2E4OTQwZS5qcGeTlQLNArwAwsOVAgDNArzCw5MJpjU5N2U4NQY/romet-rambler-29er-fs-2014.jpg",
                15, "Bicycle", "Frame size: 22\", outdoor/indoor" );
        productService.addNewEquipment("Mikasa", "Kurek", Discipline.VOLLEYBALL, 49.99D,
                "http://www.sportsworld.ps/PORTFOLIO%203/img/Balls/05.jpg",
                100, "Ball", "Size: 5, indoor" );
        productService.addNewEquipment("Everlast", "Rocky", Discipline.MARTIAL_ARTS, 22.99D,
                "https://mejoresmarcas.pro/wp-content/uploads/2019/02/Guantes-de-boxeo-Everlast-Pro-Style.jpg",
                12, "Gloves", "Size: 12 oz., for amateurs" );
        productService.addNewEquipment("Woods", "Tiger", Discipline.OTHERS, 99.99D,
                "http://tomwellsgolf.com/images/products/452driver_1.jpg",
                41, "Ball", "Size: standard, Type: Wedge" );
        productService.addNewEquipment("Garmin", "Fit", Discipline.RUNNING, 109.99D,
                "https://cdn11.bigcommerce.com/s-6nuy0v/images/stencil/original/uploaded_images/garmin-forerunner-945-colors.jpg?t=1556634010",
                85, "Clock", "Size: universal, waterproof" );
        productService.addNewEquipment("Wilson", "Egg", Discipline.OTHERS, 64.99D,
                "https://ozon-st.cdn.ngenix.net/multimedia/1023818649.jpg",
                144, "Ball", "Size: 5, outdoor, for Rugby" );
        productService.addNewEquipment("Reebok", "Swim", Discipline.SWIMMING, 14.99D,
                "https://www.passionforsavings.com/content/uploads/2018/03/swim-goggles-on-sale.png",
                115, "Goggles", "Size: 5, outdoor/indoor" );*/
    }
}
