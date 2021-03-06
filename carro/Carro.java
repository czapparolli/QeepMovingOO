package br.com.qeep.moving.oo.carro;

public class Carro {

	String nome;
	float peso;
	String fabricante;
	String cor;
	float valor;
	
	public Carro(String nome, float peso, String fabricante, String cor, float valor) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.valor = valor;
	}

	public void darDesconto(float porcentagem) {
		if (porcentagem > 0 && porcentagem <= 10) {
			this.valor = this.valor * ( 1 - (porcentagem / 100F));
		}
	}

	public void darDescontoGerente(float porcentagem) {
		if (porcentagem > 0 && porcentagem <= 20) {
			this.valor = this.valor * ( 1 - (porcentagem / 100F));
		}
	}

	public void pintar(String novaCor) {
		this.cor = novaCor;
	}
}
