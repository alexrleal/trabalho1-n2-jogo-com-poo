package com.puc.trabalho1_n2_jogo_com_poo;

import com.puc.trabalho1_n2_jogo_com_poo.domain.functions_game.FunctionsGame;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Trabalho1N2JogoComPooApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Trabalho1N2JogoComPooApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FunctionsGame.callMenu();
	}
}
