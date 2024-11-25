package com.puc.trabalho1_n2_jogo_com_poo.domain.enemies;


public class Zombie extends Enemy {
    public Zombie(String name, Integer health, Integer damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        System.out.println("""
                Habilidade: "Eterno While"
                Prende o herói em um loop infinito de pensamentos, reduzindo progressivamente sua saúde e nível de energia
                """);
    }
}
