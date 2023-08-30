package com.myspellbook.model.spell;

import com.myspellbook.model.character.Character;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "dnd_spells")
@Getter
@Setter
public class DndSpells {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "spell_id")
    private int spellId;
    @Column(name = "spell_name")
    private String spellName;
    @Column(name = "spell_level")
    private int spellLevel;
    @Column(name = "spell_type")
    private String spellType;
    @Column(name = "casting_time")
    private String castingTime;
    @Column(name = "spell_range")
    private String spellRange;
    @Column(name = "components")
    private String components;
    @Column(name = "duration")
    private String duration;
    @Column(name = "description")
    private String description;
    @Column(name = "higher_levels")
    private String higherLevels;
}

