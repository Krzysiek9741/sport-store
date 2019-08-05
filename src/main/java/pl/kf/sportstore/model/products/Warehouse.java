package pl.kf.sportstore.model.products;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<Product, Long> availability = new HashMap<>();

    public Map<Product, Long> getAvailability() {
        return availability;
    }

    public void setAvailability(Map<Product, Long> availability) {
        this.availability = availability;
    }
}
