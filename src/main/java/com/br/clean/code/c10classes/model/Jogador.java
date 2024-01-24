package com.br.clean.code.c10classes.model;

import com.br.clean.code.c10classes.enums.Mao;

public class Jogador {
	private final String nome;
	public Jogador(String nome) {super(); this.nome = nome;}
	public Mao jogar() {
		return Mao.aleatoria();
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]";
	}
}
