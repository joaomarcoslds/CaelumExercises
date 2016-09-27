package br.com.caelum.colletions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		long tempoInsercao = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		tempoInsercao = System.currentTimeMillis() - tempoInsercao;
		
		
		
		long tempoBusca = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		tempoBusca = System.currentTimeMillis() - tempoBusca;
		
		
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto total: " + tempo);
		System.out.println("Tempo gasto na insercao: " + tempoInsercao);
		System.out.println("Tempo gasto na busca: " + tempoBusca);
	}

}
