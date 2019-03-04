package model;

public class Conta {

	private int agencia;
	private long numConta;
	private int saldo;

	public Conta() {

	}

	public Conta(int agencia) {

		this.agencia = agencia;
		long i = (long) (60000 + Math.random() * 899999l);
		this.numConta = i;

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public long getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	// ----------------

	public void deposita(int valor) {
		this.saldo = this.saldo + valor;
	}

}
