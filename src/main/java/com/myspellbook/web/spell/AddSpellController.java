package com.myspellbook.web.spell;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AddSpellController {

    @GetMapping("add")
    public String wizardSpellPage() {
        return "addSpellPage";
    }
}
