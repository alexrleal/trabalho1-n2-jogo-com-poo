package com.puc.trabalho1_n2_jogo_com_poo.domain.enemies;

import com.puc.trabalho1_n2_jogo_com_poo.domain.character.Character;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Heros;
import com.puc.trabalho1_n2_jogo_com_poo.domain.inventory.Inventory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Enemy extends Character {
    public Enemy(String name, Integer health, Integer damage) {
        super(name, health, damage);
    }
}

