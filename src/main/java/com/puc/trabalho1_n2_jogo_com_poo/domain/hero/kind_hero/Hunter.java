package com.puc.trabalho1_n2_jogo_com_poo.domain.hero.kind_hero;

import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Hero;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Heros;

public class Hunter extends Hero {
    public Hunter(String name) {
        super(name, 100, 15, Heros.HUNTER);
    }

    @Override
    public void attack(){
        System.out.println("""
                Habilidade: Busca e Destruição.
                Você utiliza seu conhecimento avançado em algoritmos de busca para encontrar a fraqueza do inimigo e aplicar um golpe certeiro.
                """);
    }
}
