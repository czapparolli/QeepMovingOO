package br.com.qeep.moving.oo.conta.bancaria;

public class ContaBancaria {
	//2. Crie uma classe referente � uma conta banc�ria, que possui como atributos o seu n�mero, saldo e o nome do correntista. 
	//Crie tamb�m o m�todo saque() que serve para retirar o certo valor do saldo, 
	//o m�todo dep�sito() que serve para adiconar um valor ao saldo 
	//e o m�todo extrato() que serve para mostrar na tela o nome do correntista, o n�mero da conta e o saldo. 
	//Crie um programa principal e demonstre a utiliza��o dos m�todos implementados.
	
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
		else System.out.println("Valor depositado menor que R$ 0,00 , dep�sito cancelado");
			return false;
	}
	
	public void extrato() {
		System.out.print(" ###### EXTRATO ###### ");
		System.out.printf("\nN�mero da conta: %d", this.conta);
		System.err.printf("\nCorrentista:  %s ", this.nomeCorrentista);
		System.out.printf("\nSaldo:  %.2f ", this.saldo);
	}
	
}
