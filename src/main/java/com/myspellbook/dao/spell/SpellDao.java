package com.myspellbook.dao.spell;

import com.myspellbook.dao.model.spell.DndSpells;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpellDao extends CrudRepository<DndSpells, Integer> {
    List<DndSpells> findAll();

    @Query(value = """
            select s.*
            from dnd5_class_spells cs
            join dnd_spells s on cs.spellId = s.spell_id
            where cs.classId = ?1
            """, nativeQuery = true)
    List<DndSpells> findSpellForCharacter(int characterId);
}
