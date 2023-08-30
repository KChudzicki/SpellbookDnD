package com.myspellbook.service.character;

import com.myspellbook.dao.character.CharacterRepository;
import com.myspellbook.dao.model.character.Character;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Character> findAllInGame() {
        log.info("Find all characters which are in game.");
        return characterRepository.findAllByInGame(true);
    }
}
