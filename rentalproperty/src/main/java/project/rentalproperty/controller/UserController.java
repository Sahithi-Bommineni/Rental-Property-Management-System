package project.rentalproperty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/login")
    public String getMethodName(Model model) {
        return "login";
    }
    
    
}
