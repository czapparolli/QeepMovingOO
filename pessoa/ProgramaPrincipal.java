package br.com.qeep.moving.oo.pessoa;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoa pessoa = new Pessoa("Caio", 1995, 1.80F);
		
		pessoa.imprimeDados();
		
		System.out.print("\nDigite a nova altura: ");
		float novaAltura = teclado.nextFloat(); /* Passando parametro via input*/
		pessoa.setAltura(novaAltura);
		
		
		pessoa.imprimeDados();
		
		
		System.out.printf("\nO %s mede %.2f e tem %d anos",
				pessoa.getNome(), pessoa.getAltura(),pessoa.calculaIdade(2021));
		
		teclado.close();
		
	}	

}
