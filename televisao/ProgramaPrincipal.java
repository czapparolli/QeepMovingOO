package br.com.qeep.moving.oo.televisao;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		ControleRemoto controle = new ControleRemoto(0, 0);
		int volume = 0;
		int canal = 0;
		
		Televisao tv = new Televisao(volume,canal);

		System.out.print("aumenta o volume ai ");
		volume = teclado.nextInt();
		controle.aumentaPotencia(volume);
		tv.setVolume(volume);
		System.out.printf("\n\nO Volume da TV está em: %d",tv.getVolume());
		
		System.out.print("\nAumentou demais, abaixa aiii ");
		volume = teclado.nextInt();
		controle.diminuiPotencia(volume);
		tv.setVolume(volume);
		System.out.printf("\n\nO Volume da TV está em: %d\n",tv.getVolume());
		

		System.out.print("\nPassa de canal pra frente ai ");
		canal = teclado.nextInt();
		controle.aumentaCanal(canal);
		tv.setCanal(canal);
		System.out.printf("\n\nO canal da TV está em: %d\n",tv.getCanal());
		
		System.out.print("\nPassa de canal pra trás ai ");
		canal = teclado.nextInt();
		controle.diminuiCanal(canal);
		tv.setCanal(canal);
		System.out.printf("\n\nO canal da TV está em: %d\n",tv.getCanal());
		
		System.out.print("\nColoca no canal: ");
		canal = teclado.nextInt();
		controle.canalEspecifico(canal);
		tv.setCanal(canal);
		System.out.printf("\n\nO canal da TV está no: %d\n",tv.getCanal());
		
		System.out.printf("\nEstamos no canal %d com o volume: %d", tv.getCanal(), tv.getVolume());
		
		
		
		//System.out.println(controle.getPotencia(volume));

		// float novaAltura = teclado.nextFloat(); /* Passando parametro via input*/
		// pessoa.setAltura(novaAltura);
		teclado.close();
	}

}
