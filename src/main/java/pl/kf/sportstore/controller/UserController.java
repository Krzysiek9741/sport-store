package pl.kf.sportstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.user.Address;
import pl.kf.sportstore.model.user.User;
import pl.kf.sportstore.service.ProductService;
import pl.kf.sportstore.service.UserService;

import java.util.*;

@Controller
public class UserController {

    UserService userService;

    ProductService productService;

    @Autowired
    public UserController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }






    @GetMapping("/newProduct")
    public String addNewProduct(){
        return "addNewProduct";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout){
        if (error != null){
            model.addAttribute("error", "Bad credentials");
        }
        if (logout != null){
            model.addAttribute("message", "Logout successfully!!!");
        }
        return "login";
    }

    @GetMapping("/register")
    public String registerform(){
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam Map<String, String> userData, Model model){
        /*Address address = new Address(userData.get("street"),Integer.parseInt(userData.get("houseNumber")),
                Integer.parseInt(userData.get("zipCode")), userData.get("city"));
        User user = new User(userData.get("username"), userData.get("password"), userData.get("firstName"),
                userData.get("lastName"), address);*/

        userService.createNewUser(userData.get("username"), userData.get("password"), userData.get("firstName"),
                userData.get("lastName"), userData.get("street"),Integer.parseInt(userData.get("houseNumber")),
                Integer.parseInt(userData.get("zipCode")), userData.get("city"));

        return "redirect:/login";
    }

    @GetMapping("/admin")
    public String adminPanel(){
        return "adminPanel";
    }
}
