package br.com.qeep.moving.oo.carro;

import java.util.Scanner;
	
public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Carro gol = new Carro("Gol", 1200, "Volkswagen", "Preto", 25000);
		Carro civic = new Carro("Honda Civic", 1300, "Honda", "Vermelho", 47000);

		gol.pintar("Azul");
		civic.pintar("preto");

		System.out.printf("\nA cor do %s é %s", gol.nome, gol.cor);
		System.out.printf("\nA cor do %s é %s", civic.nome, civic.cor);

		System.out.println("");

		System.out.printf("\nO valor do %s é %s", gol.nome, gol.valor);
		System.out.printf("\nO valor do %s é %s", civic.nome, civic.valor);
		
		System.out.println("");
		
		System.out.printf("\nQuantos %% de desconto no %s? ", gol.nome);
		float desconto = teclado.nextFloat();
		gol.darDesconto(desconto);

		System.out.printf("\nQuantos %% de desconto no %s? ", civic.nome);
		float descontoGerente = teclado.nextFloat();
		civic.darDescontoGerente(descontoGerente);

		System.out.printf("\nO Valor do %s é %s", gol.nome, gol.valor);
		System.out.printf("\nO Valor do %s é %s", civic.nome, civic.valor);
		teclado.close();
	}

}
