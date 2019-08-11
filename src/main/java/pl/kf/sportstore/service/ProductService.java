package pl.kf.sportstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kf.sportstore.model.products.Discipline;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.products.cloth.ClothSize;
import pl.kf.sportstore.model.products.cloth.ClothType;
import pl.kf.sportstore.model.products.equipment.Equipment;
import pl.kf.sportstore.model.products.shoes.Shoes;
import pl.kf.sportstore.repository.ClothRepository;
import pl.kf.sportstore.repository.EquipmentRepository;
import pl.kf.sportstore.repository.ShoesRepository;

import java.util.*;

@Service
public class ProductService {

    ClothRepository clothRepository;
    ShoesRepository shoesRepository;
    EquipmentRepository equipmentRepository;

    @Autowired
    public ProductService(ClothRepository clothRepository, ShoesRepository shoesRepository, EquipmentRepository equipmentRepository) {
        this.clothRepository = clothRepository;
        this.shoesRepository = shoesRepository;
        this.equipmentRepository = equipmentRepository;
    }

    public void addNewCloth(String mark, String model, Discipline discipline, Double price, String imageUrl, Integer quantityInStock,
                            ClothType clothType, ClothSize clothSize) {
        Cloth cloth = new Cloth(mark, model, discipline, price, imageUrl, quantityInStock, clothType, clothSize);

        clothRepository.save(cloth);
    }

    public void addNewShoes(String mark, String model, Discipline discipline, Double price, String imageUrl, Integer quantityInStock,
                            Short shoesSize) {
        Shoes shoes = new Shoes(mark, model, discipline, price, imageUrl, quantityInStock, shoesSize);

        shoesRepository.save(shoes);
    }

    public void addNewEquipment(String mark, String model, Discipline discipline, Double price, String imageUrl, Integer quantityInStock,
                                String name, String description) {
        Equipment equipment = new Equipment(mark, model, discipline, price, imageUrl, quantityInStock, name, description);

        equipmentRepository.save(equipment);
    }

    public List<Cloth> getAllClothes() {
        return clothRepository.findAll();
    }

    public List<Shoes> getAllShoes() {
        return shoesRepository.findAll();
    }

    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    public List<Cloth> getClothesToShow() {
        List<Cloth> allClothes = getAllClothes();
        List<Integer> randomIntsList = generateRandom(allClothes);
        List<Cloth> clothesToShow = new ArrayList<>();
        for (int i = 0; i < randomIntsList.size(); i++) {
            clothesToShow.add(allClothes.get(randomIntsList.get(i)));
        }

        return clothesToShow;
    }

    public List<Shoes> getShoesToShow() {
        List<Shoes> allShoes = getAllShoes();
        List<Integer> randomIntsList = generateRandom(allShoes);
        List<Shoes> shoesToShow = new ArrayList<>();
        for (int i = 0; i < randomIntsList.size(); i++) {
            shoesToShow.add(allShoes.get(randomIntsList.get(i)));
        }
        return shoesToShow;
    }

    public List<Equipment> getEquipmentToShow() {
        List<Equipment> allEquipment = getAllEquipment();
        List<Integer> randomIntsList = generateRandom(allEquipment);
        List<Equipment> equipmentToShow = new ArrayList<>();
        for (int i = 0; i < randomIntsList.size(); i++) {
            equipmentToShow.add(allEquipment.get(randomIntsList.get(i)));
        }
        return equipmentToShow;
    }

    private List<Integer> generateRandom(List list){
        Random random = new Random();
        Set<Integer> randomInts = new HashSet<>();
        int setSize = randomInts.size();
        int max = 2;
        while (setSize < max) {
            randomInts.add(random.nextInt(list.size()));
            setSize = randomInts.size();
        }
        List<Integer> randomIntsList = new ArrayList<>();
        randomIntsList.addAll(randomInts);

        return randomIntsList;
    }

    public Cloth getClothById(Long id){
       return clothRepository.getOne(id);
    }

    public Shoes getShoesById(Long id){
        return shoesRepository.getOne(id);
    }

    public Equipment getEquipmentById(Long id){
        return equipmentRepository.getOne(id);
    }
}
