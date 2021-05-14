package br.com.qeep.moving.oo.elevador;

public class Elevador {
	/*
	 * 3. Crie uma classe denominada Elevador para armazenar as informações de um
	 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
	 * 0), total de andares no prédio (desconsiderando o térreo), capacidade do
	 * elevador e quantas pessoas estão presentes nele. A classe deve também
	 * disponibilizar os seguintes métodos: Entra : para acrescentar uma pessoa no
	 * elevador (só deve acrescentar se ainda houver espaço); Sai : para remover uma
	 * pessoa do elevador (só deve remover se houver alguém dentro dele); Sobe :
	 * para subir um andar (não deve subir se já estiver no último andar); Desce :
	 * para descer um andar (não deve descer se já estiver no térreo);
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
				System.out.println("\nNão é possível liberar a entrada");
				break;
			}

			if (pessoasAtual < capacidade) {
				pessoasAtual += 1;
				System.out.print("\nEntrou 1");
				System.out.printf("\nTemos %d pessoas no elevador, sua capacidade é de %d\n", pessoasAtual, capacidade);

			} else
				System.out.println("Elevador cheio !");

		} while (capacidade > valor && pessoasAtual < valor);
	}

	public void sai(int valor) {

		do {

			if (valor <= 0 && valor < pessoasAtual && valor > 15) {
				System.out.println("\nNão é possível realizar essa operação");
				break;
			}

			if (pessoasAtual > valor) {
				pessoasAtual -= 1;
				System.out.print("\nSaiu 1");
				System.out.printf("\nTemos %d pessoas no elevador, sua capacidade é de %d\n", pessoasAtual, capacidade);
				System.out.printf("\nTemos %d pessoas no elevador, sua capacidade é de %d\n", pessoasAtual, capacidade);
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
				System.out.printf("\nO andar atual é: %d\n", andarAtual);

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
				System.out.printf("\nO andar atual é: %d\n", andarAtual);
			}
		} while (andarAtual > valor && andarAtual > 0);
	}

	public static boolean andarAtual(int andarAtual) {
		if (andarAtual == 0) {
			System.out.println("O andar atual é o Térreo");
			return true;
		} else
			System.out.printf("\nO Elevador encontra-se no %dº andar", andarAtual);
		return false;
	}

}
