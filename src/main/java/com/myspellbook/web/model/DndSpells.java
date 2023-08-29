package com.myspellbook.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dndSpells")
public class DndSpells {
    @Id
    @Column(name="spell_id")
    private int spellId;
    @Column(name="spell_name")
    private String spellName;
    @Column(name="spell_level")
    private int spellLevel;
    @Column(name="spell_type")
    private String spellType;
    @Column(name="casting_time")
    private String castingTime;
    @Column(name="spell_range")
    private String spellRange;
    @Column(name="components")
    private String components;
    @Column(name="duration")
    private String duration;
    @Column(name="description")
    private String description;
    @Column(name="higher_levels")
    private String higherLevels;

    public int getSpellId() {
        return spellId;
    }

    public void setSpellId(int spellId) {
        this.spellId = spellId;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public String getSpellType() {
        return spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getSpellRange() {
        return spellRange;
    }

    public void setSpellRange(String spellRange) {
        this.spellRange = spellRange;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHigherLevels() {
        return higherLevels;
    }

    public void setHigherLevels(String higherLevels) {
        this.higherLevels = higherLevels;
    }
}

