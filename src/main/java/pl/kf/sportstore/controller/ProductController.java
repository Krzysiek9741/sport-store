package pl.kf.sportstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.kf.sportstore.model.products.Product;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.products.equipment.Equipment;
import pl.kf.sportstore.model.products.shoes.Shoes;
import pl.kf.sportstore.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Cloth> clothesToShow = productService.getClothesToShow();
        List<Shoes> shoesToShow = productService.getShoesToShow();
        List<Equipment> equipmentToShow = productService.getEquipmentToShow();


        model.addAttribute("clothes", clothesToShow);
        model.addAttribute("shoes", shoesToShow);
        model.addAttribute("equipment", equipmentToShow);
        return "index";
    }

    @GetMapping("/clothes")
    public String clothesList(Model model){
        List<Cloth> clothes = productService.getAllClothes();
        model.addAttribute("clothes", clothes);

        return "clothes";
    }

    @GetMapping("/shoes")
    public String shoesList(Model model){
        List<Shoes> shoes = productService.getAllShoes();
        model.addAttribute("shoes", shoes);

        return "shoes";
    }

    @GetMapping("/equipment")
    public String equipmentList(Model model){
        List<Equipment> equipmentList = productService.getAllEquipment();
        model.addAttribute("equipmentList", equipmentList);

        return "equipment";
    }

    @GetMapping("/details/{type}/{id}")
    public String productDetails (@PathVariable String type, @PathVariable Long id, Model model){
        Product product = null;
        if (type.equals("cloth")){
            product = productService.getClothById(id);
        }
        if (type.equals("shoes")){
            product = productService.getShoesById(id);
        }
        if (type.equals("equipment")){
            product = productService.getEquipmentById(id);
        }

        model.addAttribute("product", product);
        model.addAttribute("type", type);

        return "productDetails";
    }
}
