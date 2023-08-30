package com.myspellbook.dao;

import com.myspellbook.web.model.DndSpells;
import org.springframework.data.repository.CrudRepository;

public interface SpellDao  extends CrudRepository<DndSpells, Integer>{
}
