package br.com.qeep.moving.oo.cartaodecredito;

public class CartaoDeCredito {
	/*
	 * 4. Crie uma classe que represente um cart�o de cr�dito, que deve ter como
	 * atributos o seu limite, o saldo da fatura e nome do cliente. Crie tamb�m os
	 * m�todos aumentaLimite(), diminuiLimite(), realizaCompra() que n�o deve
	 * permitir uma compra caso o limite tenha sido atingido e o imprimeFatura() que
	 * imprime na tela o valor da fatura. Crie um programa principal capaz de
	 * executar as opera��es do cart�o de cr�dito.
	 */

	float limite;
	float faturaAtual;
	String nomeCliente;

	public CartaoDeCredito(String nomeCliente, float limite) {
		this.nomeCliente = nomeCliente;
		this.limite = limite;
		this.faturaAtual = 0;

	}

	public void imprimeFatura() {
		System.out.printf("\nCliente: %s", nomeCliente);
		System.out.printf("\nLimite atual: R$ %.2f", limite - faturaAtual);
		System.out.printf("\nA sua fatura atual do Cart�o de Cr�dito � de: R$ %.2f\n", faturaAtual);
	}

	public void aumentaLimite(float valor) {

		if (valor > 0 && valor <= 20) {
			this.limite = this.limite * (1 + (valor / 100F));
			System.out.printf("O limite atual � de R$ %.2f\n", limite);
		} else {
			System.out.println("\nLibera��o negada !");
		}

	}

	public void diminuiLimite(float valor) {

		if (valor > 0 && valor <= 20) {
			this.limite = this.limite * (1 - (valor / 100F));
			System.out.printf("\nO limite atual � de R$ %.2f\n", limite);
		}
		else {
			System.out.println("\nLibera��o negada !");
		}

	}

	public void compra(float valor) {

		if (valor > limite && valor > (limite - faturaAtual)) {

			System.out.println("Transa��o recusada, entre em contato com o seu banco !");
		}

		else {

			this.faturaAtual = this.faturaAtual + valor;
			System.out.println("Pagamento realizado com sucesso");
		}

	}

}
