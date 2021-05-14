package br.com.qeep.moving.oo.conta.bancaria;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		ContaBancaria caio = new ContaBancaria(00001, 0, "Caio Zapparolli");
		
		caio.extrato();
		caio.deposito(15000);
		System.out.println("\n");
		caio.extrato();
		caio.saque(17000);
		System.out.println("\n");
		caio.extrato();
		System.out.println("\n");
		caio.saque(5000);
		caio.extrato();
		System.out.println("\n");

	}

}
