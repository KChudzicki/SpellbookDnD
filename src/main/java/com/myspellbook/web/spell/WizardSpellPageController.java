package com.myspellbook.web.spell;

import com.myspellbook.service.spell.SpellService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class WizardSpellPageController {
    private static final String CHARACTERS_ATTRIBUTE_NAME = "results";
    private final SpellService spellService;

    @GetMapping("/spells/{classId}")
    public String wizardSpellPage(@PathVariable int classId, Model model) {
        final var result = spellService.getAllForCharacter(classId);
        model.addAttribute(CHARACTERS_ATTRIBUTE_NAME, result);
        return "wizard";
    }
}
