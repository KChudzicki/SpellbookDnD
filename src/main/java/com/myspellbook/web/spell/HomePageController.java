package com.myspellbook.web.spell;

import com.myspellbook.service.character.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomePageController {
    private static final String CHARACTERS_ATTRIBUTE_NAME = "characters";
    private final CharacterService characterService;

    @GetMapping("/")
    public String homePage(Model model) {
        final var characters = characterService.findAllInGame();
        model.addAttribute(CHARACTERS_ATTRIBUTE_NAME, characters);
        return "homePage";
    }
}
