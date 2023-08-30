package com.myspellbook.dao.character;

import com.myspellbook.dao.model.character.Character;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CharacterRepository extends CrudRepository<Character, Long> {

    List<Character> findAllByInGame(boolean inGame);
}
