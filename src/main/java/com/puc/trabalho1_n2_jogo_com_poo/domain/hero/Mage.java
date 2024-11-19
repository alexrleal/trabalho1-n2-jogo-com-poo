package com.puc.trabalho1_n2_jogo_com_poo.domain.hero;

import com.puc.trabalho1_n2_jogo_com_poo.domain.character.Character;
import com.puc.trabalho1_n2_jogo_com_poo.domain.inventory.Inventory;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 15, 1, Heros.MAGE, new Inventory());
    }
}
