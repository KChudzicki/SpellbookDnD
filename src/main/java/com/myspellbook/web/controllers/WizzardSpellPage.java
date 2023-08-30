package com.myspellbook.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WizzardSpellPage {

    @GetMapping("/wizard")
    public String WizzardSpellPage(Model model) {
        return "wizard";
    }
}
