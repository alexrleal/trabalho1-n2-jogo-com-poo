package com.puc.trabalho1_n2_jogo_com_poo.domain.battle;

import com.puc.trabalho1_n2_jogo_com_poo.domain.enemies.Enemy;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Hero;

import java.util.Scanner;

public class Battle {
    private static Scanner sc = new Scanner(System.in);

    public static void startBattle(Hero hero, Enemy enemy) {
        sc.reset();
        Integer fullHealthHero = hero.getHealth();
        Integer fullHealthEnemy = enemy.getHealth();
        Integer rotation = 1;

        System.out.print("PREPARE-SE PARA LUTAR COM O " + enemy.getName() + "!!!\nHp do boss: " + enemy.getHealth() + "/"
                + fullHealthEnemy
                + "\nDano: "
                + enemy.getDamage()
                + "\nPressione enter para iniciar...");
        sc.nextLine();
        sc.reset();

        while (hero.getHealth() != 0 && enemy.getHealth() != 0) {
            System.out.println("############ RODADA " + rotation + " ############");
            System.out.println(hero.getName() + "\nHp: " + hero.getHealth() + "/" + fullHealthHero + "\nDano: " + hero.getDamage());
            System.out.print("\n********* É sua vez! *********\n\nOPÇÕES: \n1-Atacar;\n2-Usar pote de vida.\nDigite: ");

            Integer option = 0;

            while (option != 1 || option == 2) {
                option = sc.nextInt();
                sc.reset();
                if (option == 2) {
                    hero.usePotion();
                    System.out.print("Escolha uma opcao novamente: ");
                }
                if (option != 1 && option != 2) System.out.print("Opção inválida, tente novamente: ");
            }

            enemy.receiveDamage(hero.getDamage());
            System.out.println("\n********* Voce ataca! *********");
            hero.attack();

            if (enemy.getHealth() != 0) {
                System.out.println("\n********* " + enemy.getName() + " contra-ataca! *********");
                hero.receiveDamage(enemy.getDamage());
                enemy.attack();
            }

            rotation++;
        }
        if (hero.getHealth() == 0) System.out.println("Voce perdeu!!!");
        else System.out.println("Voce venceu!!!");
    }
}
