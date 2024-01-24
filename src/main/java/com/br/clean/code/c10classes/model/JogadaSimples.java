package com.br.clean.code.c10classes.model;

import com.br.clean.code.c10classes.enums.Mao;
import com.br.clean.code.c10classes.enums.ResultadoJogada;

public class JogadaSimples implements Jogada{
	@Override
	public ResultadoJogada jogar() {
		Mao primeiraMao = primeiroJogador.jogar();
		Mao segundaMao = segundoJogador.jogar();
		if (primeiraMao.vence(segundaMao)) {
			return ResultadoJogada.PRIMEIRO_VENCE;
		}
		if (segundaMao.vence(primeiraMao)) {
			return ResultadoJogada.SEGUNDO_VENCE;
		}
		return ResultadoJogada.EMPATE;
	}

	private final Jogador primeiroJogador;
	private final Jogador segundoJogador;
	public JogadaSimples(Jogador primeiroJogador, Jogador segundoJogador) {
		super();
		if (primeiroJogador == null){
			throw new NullPointerException("O primeiro jogador é obrigatório");
		}
		if (segundoJogador == null){
			throw new NullPointerException("O segundo jogador é obrigatório");
		}
		this.primeiroJogador = primeiroJogador;
		this.segundoJogador = segundoJogador;
	}



	public Jogador getPrimeiroJogador() {
		return primeiroJogador;
	}

	public Jogador getSegundoJogador() {
		return segundoJogador;
	}

}
