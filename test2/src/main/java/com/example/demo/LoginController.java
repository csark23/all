package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.User;
import com.example.model.UserRepo;


@Controller
public class LoginController {
    
    @Autowired
    private UserRepo userRepo;
    
    @RequestMapping("/")
    public String checkMVC() {
        return "login"; 
    }
    
    @RequestMapping("/login")
    public String loginHomePage(@RequestParam("UserName") String userName,
            @RequestParam("Password") String password,Model model )
        {   
        User u;
        try {
            u=userRepo.findByName(userName);
        }
        catch(Exception e) {
            System.out.println("User Not Found !!!");
            return "login";
        }
        if(u!=null) {
            model.addAttribute("UserName", userName);
            return "homepage";
            
        }
        
        
        model.addAttribute("Error", "User Not found, Kindly Register !!!");
        return "login";
    
    }
   }