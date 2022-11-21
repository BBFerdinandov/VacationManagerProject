package com.project.VacationManagerProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "login_page";
    }

}