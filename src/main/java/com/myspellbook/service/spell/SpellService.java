package com.myspellbook.service.spell;

import com.myspellbook.model.spell.DndSpells;

import java.util.List;

public interface SpellService {
    List<DndSpells> getAllData();

    List<DndSpells> getAllForCharacter(int characterId);
}
