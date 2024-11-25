package com.puc.trabalho1_n2_jogo_com_poo.domain.hero;

import com.puc.trabalho1_n2_jogo_com_poo.domain.character.Character;
import com.puc.trabalho1_n2_jogo_com_poo.domain.inventory.Inventory;
import com.puc.trabalho1_n2_jogo_com_poo.domain.potion.Potion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Hero extends Character {
    private Heros heroClass;
    private Inventory inventory;

    public Hero(String name, Integer health, Integer damage, Heros heroClass) {
        super(name, health, damage);
        this.heroClass = heroClass;
        inventory = new Inventory(new Potion(3));
    }

    public void usePotion() {
        if (inventory.getPotion().getQuantity() > 0) {
            inventory.getPotion().usePotion();

            System.out.println("Você usou uma poção! Quantidade restante: " + inventory.getPotion().getQuantity()
                    + "\nVida curada: 50");

            this.setHealth(this.getHealth() + 50);
            if (this.getHealth() > 100) this.setHealth(100);

        } else System.out.println("Você não tem mais potes de vida.");
    }
}

