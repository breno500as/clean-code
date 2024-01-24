package com.br.clean.code.c10classes.model;

import com.br.clean.code.c10classes.enums.ResultadoJogada;

public interface Jogada {

	ResultadoJogada jogar();

	public Jogador getPrimeiroJogador();

	public Jogador getSegundoJogador();

}