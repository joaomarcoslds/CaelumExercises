package br.com.caelum.projeto.banheiro.main;

import br.com.caelum.projeto.banheiro.Banheiro;
import br.com.caelum.projeto.banheiro.Tarefa1;
import br.com.caelum.projeto.banheiro.Tarefa2;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Banheiro banheiro = new Banheiro();
		Tarefa1 tarefa1 = new Tarefa1(banheiro);
		Tarefa2 tarefa2 = new Tarefa2(banheiro);
		Thread pilha1 = new Thread(tarefa1, "Aluno1");
		Thread pilha2 = new Thread(tarefa2, "Aluno2");
		
		pilha2.start();
		//Thread.sleep(1000);
		pilha1.start();
	}

}
