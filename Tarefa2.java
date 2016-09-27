package br.com.caelum.projeto.banheiro;

public class Tarefa2 implements Runnable {
	private Banheiro banheiro;

	public Tarefa2(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	public void run() {
		try {
			this.banheiro.fazNumeroDois();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
