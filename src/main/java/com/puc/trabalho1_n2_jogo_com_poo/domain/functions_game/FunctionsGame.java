package com.puc.trabalho1_n2_jogo_com_poo.domain.functions_game;

import com.puc.trabalho1_n2_jogo_com_poo.domain.battle.Battle;
import com.puc.trabalho1_n2_jogo_com_poo.domain.enemies.Zombie;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.Hero;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.kind_hero.Hunter;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.kind_hero.Mage;
import com.puc.trabalho1_n2_jogo_com_poo.domain.hero.kind_hero.Warrior;
import com.puc.trabalho1_n2_jogo_com_poo.img.HunterImg;
import com.puc.trabalho1_n2_jogo_com_poo.img.MageImg;
import com.puc.trabalho1_n2_jogo_com_poo.img.WarriorImg;
import com.puc.trabalho1_n2_jogo_com_poo.img.ZombiesImg;

import java.util.Scanner;

public class FunctionsGame {
    private static Scanner sc = new Scanner(System.in);

    public static void callStart() {
        System.out.print("""                
                #####################################################################
                ###                                                               ###
                ###                                                               ###
                ###                  A Jornada dos Devs Perdidos                  ###
                ###                                                               ###
                ###                                                               ###
                #####################################################################
                Pressione enter para continuar...""");

        sc.nextLine();
        sc.reset();

        System.out.print("""
                                
                No distante Reino de Codópolis, existia uma academia lendária chamada PUC-GO, onde os maiores aventureiros estudavam a misteriosa arte da Programação Orientada a Objetos.
                Os alunos eram treinados para dominar habilidades poderosas, como o Polimorfismo das Profundezas, a Herança Ancestral e o temido Encapsulamento das Sombras.
                Tudo corria bem até que um terrível evento abalou o reino. Durante uma aula fatídica, o professor Leonardo, o Debugador Sombrio, revelou sua verdadeira face! 
                Ele, que parecia ser apenas um dedicado mestre de POO, na verdade era um arquivilão que planejava conquistar Codópolis com um exército de bugs selvagens e exceptions mortais.           
                "Se vocês acham que podem me vencer com System.out.println, estão redondamente enganados!" — gritou Leonardo, enquanto lançava uma StackOverflowException que destruiu a biblioteca de códigos da academia.                                
                Agora, cabe a você, um jovem dev em treinamento, reunir suas forças e lutar para restaurar a ordem no Reino de Codópolis.
                                
                Escolha sua classe: 
                o sábio Mago, que manipula códigos arcanos; 
                o corajoso Guerreiro, mestre em resolver problemas na força bruta; 
                ou o ágil Caçador, perito em rastrear bugs com precisão mortal.
                                
                Missão Principal:
                Explore os cenários do reino e enfrente os desafios deixados por Leonardo, como as Masmastringas do Caos e o Void Abissal. 
                Ao final, você deverá derrotar o Debugador Sombrio em sua fortaleza: a temida IDE Negra.
                Será que você conseguirá compilar suas forças e vencer essa batalha épica, ou será tragado pelo NullPointer das Trevas? Só o tempo dirá...
                Pressione enter para continuar...""");

        sc.nextLine();
        sc.reset();
    }

    public static Hero callSelectionHero() {
        System.out.print("""
                                
                #####################################################################
                ###    Escolha sua classe:                                        ###
                ###    1- Guerreiro (warrior)                                     ###
                ###    2- Cacador (hunter)                                        ###
                ###    3- Mago (mage)                                             ###
                #####################################################################
                Digite: """);

        String option = sc.nextLine();

        System.out.print("Informe o nome do heroi: ");
        String name = sc.nextLine();
        sc.reset();

        if (Integer.parseInt(option) == 1) return new Warrior(name);
        else if (Integer.parseInt(option) == 2) return new Hunter(name);
        else return new Mage(name);
    }

    public static void callImgHero(Hero hero) {
        if (hero instanceof Warrior) System.out.print(WarriorImg.img);
        else if (hero instanceof Hunter) System.out.print(HunterImg.img);
        else System.out.print(MageImg.img);

        System.out.print("Muito bem, bravo aventureiro! Você escolheu trilhar o caminho do " + hero.getHeroClass() + ".\n" +
                "(Ao fundo, uma música épica de seleção toca enquanto o narrador, com uma voz dramática, continua...)\n" +
                "\n" +
                "Como um verdadeiro " + hero.getHeroClass()
                + ", você carrega a responsabilidade de salvar Codópolis e devolver à PUC-GO o seu prestígio como a maior academia de POO do reino.\n" +
                "Mas cuidado! Esta jornada não será fácil. " +
                "O terrível Leonardo, o Debugador Sombrio, já enviou seus espiões: classes mal implementadas, variáveis desnecessárias e métodos static void main que nem compilar conseguem.\n" +
                "\n" +
                "De repente, um pequeno goblin chamado Erro de Sintaxe surge, tropeçando na própria lógica. Ele te entrega um pergaminho:\n" +
                "\"Ei, " + hero.getName() + "! Isso é pra você, direto do Oráculo de Lúmen. Eles dizem que você vai precisar disso se quiser vencer o Debugador!\"\n" +
                "\n" +
                "Ao abrir o pergaminho, você encontra um único conselho escrito em letras brilhantes:\n" +
                "\"Nunca confie no CTRL+C e CTRL+V.\"\n" +
                "\n" +
                "Com sua classe escolhida, você ajusta sua armadura, pega suas armas e parte em direção ao primeiro desafio: o Caos do Código Não Indentado.\n" +
                "Pressione enter para continuar...");

        sc.nextLine();
        sc.reset();
    }

    public static void callFisrtLevel(Hero hero) {
        System.out.print("""
                                
                ### INTRODUÇÃO À PRIMEIRA FASE: ###
                Com sua classe escolhida e a coragem renovada, você parte rumo ao Campus das Trevas, onde os estudantes desaparecidos foram vistos pela última vez. 
                Esse lugar, que antes era a Biblioteca Central da PUC-GO, foi transformado por Leonardo, o Debugador Sombrio, em um labirinto de códigos mal indentados e métodos sem retorno.
                                
                Ao entrar na biblioteca, você percebe que algo está errado. 
                Pilhas de livros de programação caídos, avisos de "código não compilado" riscados nas paredes, e um cheiro estranho de café queimado no ar. 
                De repente, você ouve uma voz baixa e sussurrante:
                                
                "Atenção, aventureiro! Este é o Compilador Místico. 
                Apenas aqueles que provam sua capacidade podem passar por este lugar."
                                
                Um holograma surge à sua frente, com a seguinte mensagem:
                "Para avançar, você deve enfrentar a primeira prova: 
                o Código do Caos. Encontre e corrija os bugs antes que eles se multipliquem!"
                                
                Pressione enter para continuar...""");

        sc.nextLine();
        sc.reset();

        System.out.print("""
                                
                ### A PRIMEIRA PROVA: CÓDIGO DO CAOS ###
                No meio da biblioteca, uma figura aparece. É um grupo de Classes Zumbis, cada uma com atributos mal definidos e métodos que causam erros quando chamados.
                Você percebe que o combate é inevitável. Prepare-se para a batalha por turno! O Compilador Místico avisa:
                "Seus ataques dependem de sua classe! Escolha suas ações com sabedoria para corrigir os bugs e derrotar as Classes Zumbis.\s
                E lembre-se, NullPointerException é sempre mortal!"
                                """);

        System.out.println(ZombiesImg.img);

        Battle.startBattle(hero, new Zombie("zombie", 100, 30));
    }

}
