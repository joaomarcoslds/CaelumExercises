package br.com.caelum.projeto.banheiro;

public class Tarefa1 implements Runnable {
	private Banheiro banheiro;
	
	public Tarefa1 (Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	public void run(){
		this.banheiro.fazNumeroUm();
	}
}
