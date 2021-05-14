package br.com.qeep.moving.oo.faculdade;

public class Coordenador extends Funcionario {

	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[10];
	}

	public void adicionaProfessor(Professor professor) {

		for (int i = 0; i < professoresSupervisionados.length; i++) {

			if (this.professoresSupervisionados[i] == null) {
				professoresSupervisionados[i] = professor;
				break;
			}

		}
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.05F);

	}

}
