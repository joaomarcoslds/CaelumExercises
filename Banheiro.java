package br.com.caelum.projeto.banheiro;

public class Banheiro {
	
	public synchronized void fazNumeroUm() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " entra no banheiro");
		System.out.println(nome + " faz coisa rapida");
		System.out.println(nome + " lava a mao");
		System.out.println(nome + " sai do banheiro");
	}

	public synchronized void fazNumeroDois() throws InterruptedException {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " entra no banheiro");
		System.out.println(nome + " faz coisa demorada!");

		Thread.sleep(4000);

		System.out.println(nome + " Limpando-se");
		System.out.println(nome + " lavando a mao");
		System.out.println(nome + " dah descarga");
		System.out.println(nome + " sai do banheiro");

	}
}
