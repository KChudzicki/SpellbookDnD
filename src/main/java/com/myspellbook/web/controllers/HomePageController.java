package com.myspellbook.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {


    @GetMapping("/")
    public String homePage(Model model) {
      return "homePage";
    }
}
