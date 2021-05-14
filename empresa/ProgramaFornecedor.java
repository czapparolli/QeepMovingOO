package br.com.qeep.moving.oo.empresa;

import java.util.Scanner;

public class ProgramaFornecedor {

	public static boolean cadastraFornecedor(Scanner teclado, Fornecedor[] fornecedores) {

		teclado.nextLine();
		System.out.println("\n### Vamos cadastrar o fornecedor ###\n");
		System.out.print("\nDigite o nome do fornecedor: ");
		String nome = teclado.nextLine();
		System.out.print("\nDigite o endereço do fornecedor: ");
		String endereco = teclado.nextLine();
		System.out.print("\nDigite o número de telefone do fornecedor: ");
		String telefone = teclado.nextLine();
		System.out.print("\nDigite o valor do crédito com fornecedor: R$ ");
		double valorCredito = teclado.nextDouble();
		Fornecedor.creditoMaximo(valorCredito);
		System.out.print("\nDigite de débito com o fornecedor: R$ ");
		double valorDivida = teclado.nextDouble();

		Fornecedor fornecedorCadastrado = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
		for (int i = 0; i < fornecedores.length; i++) {

			if (fornecedores[i] == null) {
				fornecedores[i] = fornecedorCadastrado;
				return true;
			}
		}
		return false;
	}

	public static void listaFornecedores(Fornecedor[] fornecedores) {
		System.out.print("\n### LISTA DOS FORNECEDORES ###");
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor != null) {
				System.out.println(fornecedor);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- BASE DE FORNECEDORES ---");
		System.out.print("\nQuantos Fornecedores teremos ? ");
		int qtdFornecedores = teclado.nextInt();

		Fornecedor[] fornecedores = new Fornecedor[qtdFornecedores];

		int opcaoMenuPrincipal = 0;

		do {
			System.out.println("\n--- PROGRAMA DE FORNECEDORES ---\n");
			System.out.println("[1] - Cadastrar fornecedor");
			System.out.println("[2] - Listar fornecedores");
			System.out.println("[0] - Para encerrar");

			opcaoMenuPrincipal = teclado.nextInt();

			switch (opcaoMenuPrincipal) {
			case 1:
				cadastraFornecedor(teclado, fornecedores);
				break;
			case 2:
				listaFornecedores(fornecedores);
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcaoMenuPrincipal != 0);

		teclado.close();

	}

}
