package pl.kf.sportstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.kf.sportstore.model.order.OrderStatus;
import pl.kf.sportstore.model.order.ShopOrder;
import pl.kf.sportstore.model.products.Product;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.products.equipment.Equipment;
import pl.kf.sportstore.model.products.shoes.Shoes;
import pl.kf.sportstore.service.ProductService;
import pl.kf.sportstore.service.ShopOrderService;
import pl.kf.sportstore.service.UserService;

import java.security.Principal;
import java.util.List;

@Controller
public class ProductController {

    ProductService productService;
    ShopOrderService shopOrderService;
    UserService userService;

    @Autowired
    public ProductController(ProductService productService, ShopOrderService shopOrderService, UserService userService) {
        this.productService = productService;
        this.shopOrderService = shopOrderService;
        this.userService = userService;
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

    @PostMapping("/addToCart")
    public String addToCart(@RequestParam Long prodId, String prodType, Principal principal){
        ShopOrder shopOrder = shopOrderService.getShopOrderByCustomerAnsStatus(
                userService.getUserByUsername(principal.getName()), OrderStatus.STARTED);
        if (shopOrder == null){
            shopOrder = new ShopOrder(userService.getUserByUsername(principal.getName()));
        }
        shopOrder.addToCart(productService.getProductById(prodId, prodType), prodType);
        shopOrderService.saveOrder(shopOrder);

        return "redirect:/addedToCart";
    }

    @GetMapping("/addedToCart")
    public String addedToCart(){
        return "addedToCart";
    }

    @GetMapping("/myCart")
    public String productsInCart(Model model, Principal principal){
        ShopOrder shopOrder = shopOrderService.getShopOrderByCustomerAnsStatus(
                userService.getUserByUsername(principal.getName()), OrderStatus.STARTED);

        List<Product> products = shopOrderService.getAllProductsFromCart(shopOrder);

        model.addAttribute("products", products);

        return "cart";
    }
}
