package br.com.qeep.moving.oo.cartaodecredito;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CartaoDeCredito caio = new CartaoDeCredito ("Caio Zapparolli", 5000 );
		
		
		caio.imprimeFatura();
		System.out.print("\nDigite quantos % você deseja aumentar no limite do cliente: ");
		float aumentaLimite = teclado.nextFloat(); 
		caio.aumentaLimite(aumentaLimite);
		caio.imprimeFatura();
		
		System.out.print("\nDigite quantos % você deseja diminuir no limite do cliente: ");
		float diminuiLimite = teclado.nextFloat(); 
		caio.diminuiLimite(diminuiLimite);
		caio.imprimeFatura();
		
		System.out.print("\nDigite o valor da compra: R$");
		float compra = teclado.nextFloat(); 
		caio.compra(compra);
		caio.imprimeFatura();
		
		teclado.close();
	}

}
