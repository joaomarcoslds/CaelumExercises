package br.com.caelum.contas.modelo;

/**
 * Descricao: Conta do Cliente
 * 
 * @author Joao Marcos
 * @version 1.0
 */
public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int numero;
	private String agencia;
	private String titular;

	//-----------------------------------------------sets e gets-----------------------------------------------
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	/**
	 * Atribui um nome a agencia
	 * 
	 * @author Joao Marcos
	 * @param agencia
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTipo(){
		return "Conta";
	}
	//-----------------------------------------------Metodos de Conta-----------------------------------------------
	/**
	 * Descricao: Deposita um valor na conta
	 * 
	 * @param valor
	 * @author Joao Marcos
	 */
	public void deposita(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Voce tentou depositar:" + valor + " Que eh um valor");
		}
		else {
		this.saldo += valor;
		}
	}
	
	//@Override
	/*public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}*/
	
	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia:" + agencia + "]";
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		
		return this.titular.compareTo(outraConta.titular);
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

}
