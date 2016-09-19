package br.com.caelum.contas.modelo;

public class Cliente {

	private int identidade;
	private int idade;
	private String titular;

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String nome) {
		this.titular = nome;
	}
}
