package br.com.qeep.moving.oo.empresa;

public class Fornecedor extends Pessoa {
	// Considere, como subclasse da classe Pessoa (desenvolvida no item anterior) a
	// classe Fornecedor.
	// Considere que cada instância da classe Fornecedor tem, para além dos
	// atributos que caracterizam a classe Pessoa,
	// os atributos valorCredito (correspondente ao crédito máximo atribuído ao
	// fornecedor) e
	// valorDivida (montante da dívida para com o fornecedor).
	// Implemente na classe Fornecedor, para além dos usuais métodos seletores e
	// modificadores,
	// um método obterSaldo() que devolve a diferença entre os valores dos atributos
	// valorCredito e valorDivida.

	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public static double creditoMaximo(double valorCredito) {

		if (valorCredito > 5000) {
			System.out.println("\nCrédito acima do limite permitido");

		} else {
			System.out.println("Crédito liberado");
		}
		return valorCredito;
	}

//	public static double dividaMaxima(double valorDivida) {
	// }

	/*
	 * public boolean dividaMaxima(double valorDivida) { if (valorDivida > 450000) {
	 * System.err.
	 * println("ENTRE EM CONTATO COM O SETOR FINANCEIRO !, CRÉDITO BLOQUEADO");
	 * return true; } return false; }
	 */

	public double obterSaldo(double valorCredito, double valorDivida) {

		double saldo = valorCredito - valorDivida;
		return saldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	@Override
	public String toString() {
		return "\n\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco()
				+ "\nSaldo atual: R$ " + obterSaldo(valorCredito, valorDivida);
	}

}
