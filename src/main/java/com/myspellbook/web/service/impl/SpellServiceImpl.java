package com.myspellbook.web.service.impl;

import com.myspellbook.dao.SpellDao;
import com.myspellbook.web.model.DndSpells;
import com.myspellbook.web.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpellServiceImpl implements SpellService {
    @Autowired
    SpellDao spellDao;
    @Override
    public List<DndSpells> getAllData() {
      return (List <DndSpells>)spellDao.findAll();
    }
}
