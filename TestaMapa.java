package br.com.caelum.mapa;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;


public class TestaMapa {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.deposita(1000);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(2000);
		
		Map mapaDeContas = new HashMap();
		
		mapaDeContas.put("diretor",c1);
		mapaDeContas.put("gerente",c2);
		
		
	}

}
