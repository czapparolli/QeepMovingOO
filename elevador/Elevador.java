package br.com.qeep.moving.oo.elevador;

public class Elevador {
	/*
	 * 3. Crie uma classe denominada Elevador para armazenar as informa��es de um
	 * elevador dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo =
	 * 0), total de andares no pr�dio (desconsiderando o t�rreo), capacidade do
	 * elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m
	 * disponibilizar os seguintes m�todos: Entra : para acrescentar uma pessoa no
	 * elevador (s� deve acrescentar se ainda houver espa�o); Sai : para remover uma
	 * pessoa do elevador (s� deve remover se houver algu�m dentro dele); Sobe :
	 * para subir um andar (n�o deve subir se j� estiver no �ltimo andar); Desce :
	 * para descer um andar (n�o deve descer se j� estiver no t�rreo);
	 * 
	 * Crie um programa principal capaz de interagir com seu Elevador.
	 */

	int andarAtual;
	int totalAndares;
	int capacidade;
	int pessoasAtual;

	public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoasAtual) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.pessoasAtual = pessoasAtual;
	}

	public void entra(int valor) {

		do {

			if (valor <= 0 && valor > 15 && valor > pessoasAtual) {
				System.out.println("\nN�o � poss�vel liberar a entrada");
				break;
			}

			if (pessoasAtual < capacidade) {
				pessoasAtual += 1;
				System.out.print("\nEntrou 1");
				System.out.printf("\nTemos %d pessoas no elevador, sua capacidade � de %d\n", pessoasAtual, capacidade);

			} else
				System.out.println("Elevador cheio !");

		} while (capacidade > valor && pessoasAtual < valor);
	}

	public void sai(int valor) {

		do {

			if (valor <= 0 && valor < pessoasAtual && valor > 15) {
				System.out.println("\nN�o � poss�vel realizar essa opera��o");
				break;
			}

			if (pessoasAtual > valor) {
				pessoasAtual -= 1;
				System.out.print("\nSaiu 1");
				System.out.printf("\nTemos %d pessoas no elevador, sua capacidade � de %d\n", pessoasAtual, capacidade);
				System.out.printf("\nTemos %d pessoas no elevador, sua capacidade � de %d\n", pessoasAtual, capacidade);
			}
		} while (pessoasAtual > valor);
	}

	public void sobe(int valor) {

		do {
			if (valor < andarAtual || valor > totalAndares) {
				System.out.println("Andar invalido");
				break;
			}
			if (andarAtual >= 0 && andarAtual <= 24) {
				andarAtual += 1;
				System.out.print("\nSubindo...");
				System.out.printf("\nO andar atual �: %d\n", andarAtual);

			}

		} while (andarAtual < valor && andarAtual < totalAndares);
	}

	public void desce(int valor) {

		do {
			if (valor > andarAtual || valor < 0) {
				System.out.println("Andar invalido");
				break;
			}

			if (andarAtual >= 0 && andarAtual <= 24) {
				andarAtual -= 1;
				System.out.print("\nDescendo...");
				System.out.printf("\nO andar atual �: %d\n", andarAtual);
			}
		} while (andarAtual > valor && andarAtual > 0);
	}

	public static boolean andarAtual(int andarAtual) {
		if (andarAtual == 0) {
			System.out.println("O andar atual � o T�rreo");
			return true;
		} else
			System.out.printf("\nO Elevador encontra-se no %d� andar", andarAtual);
		return false;
	}

}
