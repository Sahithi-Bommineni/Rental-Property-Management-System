package project.rentalproperty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    
    @GetMapping("/ownerhome")
    public String ownherlogin(Model model) {
        return "ownerhome";
    }
    
}
