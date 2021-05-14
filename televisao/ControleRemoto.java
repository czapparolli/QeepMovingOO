package br.com.qeep.moving.oo.televisao;

public class ControleRemoto {

	/*
	 * 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
	 * volume e trocar os canais da televisão. O controle de volume permite:
	 * 
	 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
	 * 
	 * aumentar e diminuir o número do canal em uma unidade;
	 * 
	 * trocar para um canal indicado;
	 * 
	 * consultar o valor do volume de som e o canal selecionado;
	 * 
	 * Crie depois um programa principal que interaja com as suas classes, não se
	 * esqueça dos modificadores de acesso e dos getters e setters em suas classes.
	 */

	private int potencia;
	private int numeroCanal;

	public ControleRemoto(int potencia, int numeroCanal) {
		this.potencia = 0;
		this.numeroCanal = 0;
	}

	public void aumentaPotencia(int valor) {
		if (valor >= 0 && valor < 100) {
			while (potencia < valor) {
				potencia++;
				System.out.printf("\nAumentando o SOOOOOM - %d", potencia);
			}
		} else {
			System.out.println("\nVolume Inválido");
			potencia = potencia - valor;
		}
	}

	public void diminuiPotencia(int valor) {
		if (potencia > 0 && potencia <= 100) {
			if (valor >= 0 && valor < 100) {
				while (potencia > valor) {
					potencia--;
					System.out.printf("\nAbaixando o SOOOOOM - %d", potencia);
				}
			}
		} else {
			System.out.println("\nVolume Inválido");
			potencia = 0;
		}
	}

	public void aumentaCanal(int valor) {
		if (valor >= 0 && valor < 100) {
			while (numeroCanal < valor) {
				numeroCanal++;
				System.out.printf("\ntrocando de canal: %d", numeroCanal);
			}
		} else
			System.out.println("\nVolume Inválido");
	}

	public void diminuiCanal(int valor) {
		if (valor >= 0 && valor < 100) {
			while (numeroCanal > valor) {
				numeroCanal--;
				System.out.printf("\ntrocando de canal: %d", numeroCanal);
			}
		} else
			System.out.println("\nVolume Inválido");
	}

	public void canalEspecifico(int valor) {
		if (valor >= 0 && valor < 100) {
			numeroCanal = valor;
			System.out.print("\ntrocando de canal...");
		}
	}

	public void consultaCanalVolume() {
		//System.out.printf("\nEstamos no canal %d com o volume: %d", numeroCanal, volume);
	}

	public int getPotencia(int volume) {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNumeroCanal() {
		return numeroCanal;
	}

	public void setNumeroCanal(int numeroCanal) {
		this.numeroCanal = numeroCanal;
	}

}
