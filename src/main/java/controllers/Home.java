package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Home {

    String contact;
    List<String> savedInput;


    @GetMapping("/index")
    String index(){
        return "index";
    }


    @GetMapping("/contact")
    String contact(){
        return "contact";
    }

    @PostMapping("/contact")
    String contact(@RequestParam String input){
        return contact;
    }

    List contactList(Model model, List<String> savedInput){
        String welcomeMessage = "Welcome to my first web app";
        model.addAttribute("welcomeMessage",welcomeMessage);


        return savedInput;
    }

}
