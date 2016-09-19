package br.com.caelum.contas.modelo;

/**
 * Descricao: Conta do Cliente
 * 
 * @author Joao Marcos
 * @version 1.0
 */
public abstract class Conta {

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
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

}
