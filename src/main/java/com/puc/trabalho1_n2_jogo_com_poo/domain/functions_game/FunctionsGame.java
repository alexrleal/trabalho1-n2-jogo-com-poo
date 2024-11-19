package com.puc.trabalho1_n2_jogo_com_poo.domain.functions_game;

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

    public static void callSelectionHero() {
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

}
