package com.puc.trabalho1_n2_jogo_com_poo.domain.functions_game;

import com.puc.trabalho1_n2_jogo_com_poo.domain.character.Character;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Hunter;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Mage;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Warrior;
import com.puc.trabalho1_n2_jogo_com_poo.img.WarriorImg;

import java.util.Scanner;

public class FunctionsGame {
    private static Scanner sc = new Scanner(System.in);

    public static void callMenu() {
        System.out.print("""                
                #####################################################################
                ###                                                               ###
                ###                                                               ###
                ###               Escreva qualquer coisa para jogar               ###
                ###                                                               ###
                ###                                                               ###
                #####################################################################
                """);

        String result = sc.nextLine();
    }

    public static Character callSelectionHero() {
        System.out.print("""
                #####################################################################
                ###    Escolha sua classe:                                        ###
                ###    1- Guerreiro                                               ###
                ###    2- Cacador                                                 ###
                ###    3- Mago                                                    ###
                #####################################################################
                """);

        String option = sc.nextLine();

        System.out.print("Informe o nome do heroi: ");
        String name = sc.nextLine();

        if (Integer.parseInt(option) == 1) {
            return new Warrior(name);
        } else if (Integer.parseInt(option) == 2) {
            return new Hunter(name);
        } else {
            return new Mage(name);
        }
    }

    public static void callImgHero(Character hero) {
        if (hero instanceof Warrior) {
            System.out.print(WarriorImg.img);
        } else if (hero instanceof Hunter) {
            System.out.print("""
                    """);
        } else {
            System.out.print("""
                    """);
        }
    }

}
