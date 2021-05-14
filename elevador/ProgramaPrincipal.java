package br.com.qeep.moving.oo.elevador;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Elevador EdificioCopan = new Elevador(0, 25, 15, 0);
		Scanner teclado = new Scanner(System.in);

		//EdificioCopan.andarAtual(0);

		
		System.out.println("\n ### Cabe mais um? ###");
		System.out.printf("\nTemos %d pessoas no elevador, sua capacidade � de %d\n", EdificioCopan.pessoasAtual, EdificioCopan.capacidade);
		System.out.printf("\nO andar atual � o %d\n", EdificioCopan.andarAtual);
		System.out.print("\nQuantas pessoas v�o entrar?? ");
		int entra = teclado.nextInt();
		EdificioCopan.entra(entra);
		
		System.out.println("\n ### Subindo andares ###");
		System.out.print("\nO andar atual � o T�rreo\n");
		System.out.print("\nPara qual andar voc� deseja ir? ");
		int sobe = teclado.nextInt();
		EdificioCopan.sobe(sobe);

		System.out.println("\n ### Descendo andares ###");
		System.out.printf("\nO andar atual � %d\n", EdificioCopan.andarAtual);
		System.out.print("Para qual andar voc� deseja ir? ");
		int desce = teclado.nextInt();
		EdificioCopan.desce(desce);
		
		
		System.out.println("\n ### Quem desce? ###");
		System.out.printf("\nTemos %d pessoas no elevador, e estamos no %d� andar, quantos v�o descer?", EdificioCopan.pessoasAtual, EdificioCopan.andarAtual);
		int sai = teclado.nextInt();
		EdificioCopan.sai(sai);
		
		teclado.close();
		
		
		
		

	}

}
