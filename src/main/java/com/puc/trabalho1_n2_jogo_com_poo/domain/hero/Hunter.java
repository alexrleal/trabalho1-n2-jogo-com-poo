package com.puc.trabalho1_n2_jogo_com_poo.domain.hero;

import com.puc.trabalho1_n2_jogo_com_poo.domain.character.Character;
import com.puc.trabalho1_n2_jogo_com_poo.domain.inventory.Inventory;

public class Hunter extends Character {
    public Hunter(String name) {
        super(name, 100, 15, 1, Heros.HUNTER, new Inventory());
    }
}
