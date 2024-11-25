package com.puc.trabalho1_n2_jogo_com_poo.domain.hero.kind_hero;

import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Hero;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Heros;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, 100, 15, Heros.MAGE);
    }

    @Override
    public void attack() {
        System.out.println("""
                Habilidade: Depuração Explosiva.
                Você lança um feitiço que sobrecarrega o inimigo com bugs caóticos, causando dano em sua lógica interna.
                """);
    }
}
