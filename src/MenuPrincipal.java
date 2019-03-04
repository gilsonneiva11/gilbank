import java.util.Scanner;

import model.Cliente;
import model.Conta;
import utils.Utilitarios;

public class MenuPrincipal {

	static Cliente cliente = new Cliente();
	static Conta conta = new Conta();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		criarMenuPrincipal(sc);

	}

	private static void criarMenuPrincipal(Scanner sc) {
		System.out.println("1 - Cadastrar novo cliente / Criar conta. ");
		System.out.println("2 - Consultar informa��es do cliente. ");
		System.out.println("3 - Depositar. ");
		System.out.println("4 - Sacar. ");
		System.out.println("5 - Transferir. ");
		System.out.println("\nDIGITE A OPERA��O DESEJADA : ");
		int op = sc.nextInt();

		switch (op) {
		case 1:
			cliente = cadastrarCliente(sc);
			break;
		case 2:
			consultarCliente(sc, cliente);
			break;
		case 3:
			System.out.println("Caso 3");
			break;
		case 4:
			Utilitarios.pularLinhas();
			criarMenuPrincipal(sc);
			break;
		default:
			System.out.println("\n### Digite uma op��o v�lida ! ### ");
		}

	}

	private static Cliente cadastrarCliente(Scanner sc) {
		Utilitarios.pularLinhas();
		System.out.println("##### CADASTRO DE NOVO CLIENTE ######");
		Cliente cliente = new Cliente();
		System.out.println("\nNome do cliente:");
		cliente.setNome(sc.next());
		System.out.println("\nEndere�o :");
		cliente.setEndereco(sc.next());
		System.out.println("\nCPF (somente n�meros) :");
		cliente.setCpf(sc.next());

		System.out.println("\nN�mero da ag�ncia :");
		conta.setAgencia((sc.nextInt()));
		System.out.println("\nSaldo inicial da conta :");
		conta.deposita(sc.nextInt());

		cliente.setConta(conta);

		Utilitarios.pularLinhas();
		System.out.println("##### CONTA CRIADA COM SUCESSO ######");
		System.out.println("\nNome: " + cliente.getNome());
		System.out.println("\nAg�ncia: " + cliente.getConta().getAgencia());
		System.out.println("\nN�mero conta: " + cliente.getConta().getNumConta());
		System.out.println("\nSaldo: " + cliente.getConta().getSaldo());

		criarMenuPrincipal(sc);

		return cliente;
	}

	private static void consultarCliente(Scanner sc, Cliente cliente) {
		Utilitarios.pularLinhas();

		System.out.println("##### CONTA CRIADA COM SUCESSO ######");
		System.out.println("\nNome: " + cliente.getNome());

		System.out.println("\nN�mero conta: " + cliente.getConta().getNumConta());
		System.out.println("\nSaldo: " + cliente.getConta().getSaldo());

		System.out.println("\n--> Para voltar digite 0 e tecle ENTER ");

		int op = sc.nextInt();

		switch (op) {
		case 0:
			Utilitarios.pularLinhas();
			criarMenuPrincipal(sc);
			break;
		}

	}

}
