package com.myspellbook.service.character;

import com.myspellbook.dao.model.character.Character;

import java.util.List;

public interface CharacterService {

    List<Character> findAllInGame();
}
