package com.myspellbook.service.spell;

import com.myspellbook.dao.spell.SpellDao;
import com.myspellbook.model.spell.DndSpells;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
class SpellServiceImpl implements SpellService {
    private final SpellDao spellDao;

    @Override
    @Transactional(readOnly = true)
    public List<DndSpells> getAllData() {
        return spellDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<DndSpells> getAllForCharacter(int characterId) {
        log.info("Find all spells for {} character", characterId);
        return spellDao.findSpellForCharacter(characterId);
    }
}
