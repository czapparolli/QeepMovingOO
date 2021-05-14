package br.com.qeep.moving.oo.conta.bancaria;

public class ContaBancaria {
	//2. Crie uma classe referente à uma conta bancária, que possui como atributos o seu número, saldo e o nome do correntista. 
	//Crie também o método saque() que serve para retirar o certo valor do saldo, 
	//o método depósito() que serve para adiconar um valor ao saldo 
	//e o método extrato() que serve para mostrar na tela o nome do correntista, o número da conta e o saldo. 
	//Crie um programa principal e demonstre a utilização dos métodos implementados.
	
	int conta;
	float saldo;
	String nomeCorrentista;
	
	public ContaBancaria(int conta, float saldo, String nomeCorrentista) {
		this.conta = conta;
		this.saldo = 0;
		this.nomeCorrentista = nomeCorrentista;
	}
	
	public boolean saque(float valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
			return false;
	}
	
	public boolean deposito(float valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		else System.out.println("Valor depositado menor que R$ 0,00 , depósito cancelado");
			return false;
	}
	
	public void extrato() {
		System.out.print(" ###### EXTRATO ###### ");
		System.out.printf("\nNúmero da conta: %d", this.conta);
		System.err.printf("\nCorrentista:  %s ", this.nomeCorrentista);
		System.out.printf("\nSaldo:  %.2f ", this.saldo);
	}
	
}
