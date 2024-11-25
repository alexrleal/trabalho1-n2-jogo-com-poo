package com.puc.trabalho1_n2_jogo_com_poo.domain.hero.kind_hero;

import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Hero;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Heros;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 100, 15, Heros.WARRIOR);
    }

    @Override
    public void attack() {
        System.out.println("""
                Habilidade: Força Bruta.
                Cansado de refatorar código, você utiliza um ataque devastador inspirado por horas de programação, destruindo tudo à sua frente.
                """);
    }
}
