package model;

import java.util.Scanner;

import utils.Utilitarios;


public class Cliente {
	
	private String nome;
	private String endereco;
	private String cpf;
	private Conta conta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	private static Cliente cadastrarCliente(Scanner sc) {
		Utilitarios.pularLinhas();
		System.out.println("##### CADASTRO DE NOVO CLIENTE ######");
		Cliente cliente = new Cliente();
		System.out.println("\nNome do cliente:");
		cliente.setNome(sc.next());
		System.out.println("\nEndereço :");
		cliente.setEndereco(sc.next());
		System.out.println("\nCPF (somente números) :");
		cliente.setCpf(sc.next());

		System.out.println("\nNúmero da agência :");
		Conta conta = new Conta(sc.nextInt());
		System.out.println("\nSaldo inicial da conta :");
		conta.deposita(sc.nextInt());

		cliente.setConta(conta);

		Utilitarios.pularLinhas();
		System.out.println("##### CONTA CRIADA COM SUCESSO ######");
		System.out.println("\nNome: " + cliente.getNome());
		System.out.println("\nAgência: " + cliente.getConta().getAgencia());
		System.out.println("\nNúmero conta: " + cliente.getConta().getNumConta());
		System.out.println("\nSaldo: " + cliente.getConta().getSaldo());

		System.out.println("\n--> Para voltar digite 0 e tecle ENTER ");

		int op = sc.nextInt();

		switch (op) {
		case 0:
			Utilitarios.pularLinhas();
			break;
		}

		return cliente;
	}
	

}
