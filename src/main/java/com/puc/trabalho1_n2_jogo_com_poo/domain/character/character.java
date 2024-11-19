package com.puc.trabalho1_n2_jogo_com_poo.domain.character;

import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Heros;
import com.puc.trabalho1_n2_jogo_com_poo.domain.inventory.Inventory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@ToString
public abstract class Character {
    private String name;
    private Integer health;
    private Integer damage;
    private Integer level;
    private Heros heroClass;
    private Inventory inventory;

    public void receiveDamage(Integer damage) {
        this.damage -= damage;
        if (this.damage < 0) this.damage = 0;
    }
}

