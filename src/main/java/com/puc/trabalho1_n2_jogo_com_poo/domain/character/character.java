package com.puc.trabalho1_n2_jogo_com_poo.domain.character;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Character {
    private String name;
    private Integer health;
    private Integer damage;

    public void receiveDamage(Integer damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void attack() {
    }
}

