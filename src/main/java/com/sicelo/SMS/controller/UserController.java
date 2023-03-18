package com.sicelo.SMS.controller;

import com.sicelo.SMS.entity.User;
import com.sicelo.SMS.respository.UserRepository;
import com.sicelo.SMS.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String login(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("/userLogin")
    public String loginUser(@ModelAttribute("user") User user){
        if (userService.storedPasswordDetails(user.getPassword())!=null){
            return "redirect:/students";
        }
        return "login";
    }
}
