package pl.kf.sportstore.model.products;

import pl.kf.sportstore.model.products.Discipline;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Product {

    private String mark;
    private String model;
    @Enumerated(EnumType.STRING)
    private Discipline discipline;
    private Double price;
    private Integer quantityInStock;

    public Product() {
    }

    public Product(String mark, String model, Discipline discipline, Double price, Integer quantityInStock) {
        this.mark = mark;
        this.model = model;
        this.discipline = discipline;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
