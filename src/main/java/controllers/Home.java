package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class Home {

    String contact;
    List<String> savedInput;


    @GetMapping("/index")
   public String index(){
        return "index";
    }


    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @PostMapping("/contact")
    public String contact(@RequestParam String input){
        return contact;
    }

    @GetMapping("/index")
    public String index(Model model){
        String welcomeMessage = "Welcome to my first web app";
        model.addAttribute("welcomeMessage",welcomeMessage);

        String productName= "test";
        int price= 10000;
        LocalDate date = LocalDate.now();


        model.addAttribute("productName",productName);
        model.addAttribute("price",price);
        model.addAttribute("d",date);


        return "index";
    }

}
