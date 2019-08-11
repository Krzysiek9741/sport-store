package pl.kf.sportstore.model.products.shoes;

import pl.kf.sportstore.model.products.Discipline;
import pl.kf.sportstore.model.products.Product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shoes extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Short shoesSize;


    public Shoes(String mark, String model, Discipline discipline, Double price, String imageUrl, Integer quantityInStock,
                 Short shoesSize) {
        super(mark, model, discipline, price, imageUrl, quantityInStock);
        this.shoesSize = shoesSize;
    }

    public Shoes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getShoesSize() {
        return shoesSize;
    }

    public void setShoesSize(Short shoesSize) {
        this.shoesSize = shoesSize;
    }


}
