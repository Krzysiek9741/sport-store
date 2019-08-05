package pl.kf.sportstore.model.products.cloth;

import pl.kf.sportstore.model.products.Discipline;
import pl.kf.sportstore.model.products.Product;

import javax.persistence.*;

@Entity
public class Cloth extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ClothType clothType;
    @Enumerated(EnumType.STRING)
    private ClothSize clothSize;

    public Cloth(String mark, String model, Discipline discipline, Double price, Integer quantityInStock) {
        super(mark, model, discipline, price, quantityInStock);
    }

    public Cloth() {
    }

    public ClothType getClothType() {
        return clothType;
    }

    public void setClothType(ClothType clothType) {
        this.clothType = clothType;
    }

    public ClothSize getClothSize() {
        return clothSize;
    }

    public void setClothSize(ClothSize clothSize) {
        this.clothSize = clothSize;
    }


}
