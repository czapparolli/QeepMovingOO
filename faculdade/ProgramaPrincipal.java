package br.com.qeep.moving.oo.faculdade;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static boolean cadastraProfessor(Scanner teclado, Professor[] professores) {

		teclado.nextLine();
		System.out.println("Vamos cadastrar o professor: ");
		System.out.println("Digite o nome do professor: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o CPF do professor: ");
		String cpf = teclado.next();
		System.out.println("Digite o número de registro do professor: ");
		int nroRegistro = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o orgão de lotação: ");
		String orgaoLotacao = teclado.nextLine();
		System.out.println("Digite o salário: ");
		double salario = teclado.nextDouble();
		System.out.println("Digite o nível de graduação: ");
		String nivelGraduacao = teclado.next();
		System.out.println("Digite a disciplina ministrada: ");
		teclado.nextLine();
		String disciplina = teclado.nextLine();

		Professor professorCadastrado = new Professor(nome, cpf, nroRegistro, orgaoLotacao, salario, nivelGraduacao,
				disciplina, 0, 0);
		for (int i = 0; i < professores.length; i++) {

			if (professores[i] == null) {
				professores[i] = professorCadastrado;
				return true;
			}
		}

		return false;
	}

	public static boolean cadastraCoordenador(Scanner teclado, Coordenador[] coordenadores) {

		teclado.nextLine();
		System.out.println("Vamos cadastrar o coordenador ");
		System.out.print("\nDigite o nome do coordenador: ");
		String nome = teclado.nextLine();
		System.out.print("\nDigite o CPF do coordenador: ");
		String cpf = teclado.next();
		System.out.print("\nDigite o número de registro do coordenador: ");
		int nroRegistro = teclado.nextInt();
		teclado.nextLine();
		System.out.print("\nDigite o orgão de lotação: ");
		String orgaoLotacao = teclado.nextLine();
		System.out.print("\nDigite o salário: ");
		double salario = teclado.nextDouble();

		Coordenador coordenadorCadastrado = new Coordenador(nome, cpf, nroRegistro, orgaoLotacao, salario);
		for (int i = 0; i < coordenadores.length; i++) {

			if (coordenadores[i] == null) {
				coordenadores[i] = coordenadorCadastrado;
				return true;
			}
		}

		return false;
	}

	public static boolean cadastraAdministrativo(Scanner teclado, FuncionarioAdministrativo[] funcionariosAdm) {

		teclado.nextLine();
		System.out.println("Vamos cadastrar o Admnistrativo ");
		System.out.print("\nDigite o nome do Admnistrativo: ");
		String nome = teclado.nextLine();
		System.out.print("\nDigite o CPF do Admnistrativo: ");
		String cpf = teclado.next();
		System.out.print("\nDigite o número de registro do Admnistrativo: ");
		int nroRegistro = teclado.nextInt();
		teclado.nextLine();
		System.out.print("\nDigite o orgão de lotação: ");
		String orgaoLotacao = teclado.nextLine();
		System.out.print("\nDigite o salário: ");
		double salario = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("\nDigite a função administrativa: ");
		String funcaoAdministrativa = teclado.nextLine();
		System.out.print("\nDigite a senioridade: ");
		String senioridade = teclado.nextLine();
		FuncionarioAdministrativo administrativoCadastrado = new FuncionarioAdministrativo(nome, cpf, nroRegistro,
				orgaoLotacao, salario, funcaoAdministrativa, senioridade);

		for (int i = 0; i < funcionariosAdm.length; i++) {

			if (funcionariosAdm[i] == null) {
				funcionariosAdm[i] = administrativoCadastrado;
				return true;
			}
		}

		return false;
	}

	public static void listaProfessores(Professor[] professores) {
		for (Professor professor : professores) {
			if (professor != null) {
				System.out.println(professor);
			}
		}
	}

	public static void listaCoordenadores(Coordenador[] coordenadores) {
		for (Coordenador coordenador : coordenadores) {
			if (coordenador != null) {
				System.out.println(coordenador);
			}
		}
	}

	public static void listaAdministrativos(FuncionarioAdministrativo[] funcionariosAdm) {
		for (FuncionarioAdministrativo administrativo : funcionariosAdm) {
			if (administrativo != null) {
				System.out.println(administrativo);
			}
		}
	}

	public static Professor buscaProfessor(Scanner teclado, Professor[] professores) {

		System.out.println("Digite o CPF pelo qual você quer pesquisar: ");
		String cpfConsultado = teclado.next();
		for (int i = 0; i < professores.length; i++) {

			if (professores[i] != null && professores[i].getCpf().equals(cpfConsultado)) {
				return professores[i];
			}

		}

		return null;
	}

	public static Coordenador buscaCoordenador(Scanner teclado, Coordenador[] coordenadores) {

		System.out.println("Digite o CPF pelo qual você quer pesquisar: ");
		String cpfConsultado = teclado.next();
		for (int i = 0; i < coordenadores.length; i++) {

			if (coordenadores[i] != null && coordenadores[i].getCpf().equals(cpfConsultado)) {
				return coordenadores[i];
			}

		}
		return null;
	}

	public static FuncionarioAdministrativo buscaAdministrativo(Scanner teclado,FuncionarioAdministrativo[] funcionariosAdm) {

		System.out.println("Digite o CPF pelo qual você quer pesquisar: ");
		String cpfConsultado = teclado.next();
		for (int i = 0; i < funcionariosAdm.length; i++) {

			if (funcionariosAdm[i] != null && funcionariosAdm[i].getCpf().equals(cpfConsultado)) {
				return funcionariosAdm[i];
			}

		}

		return null;
	}

	public static boolean removeProfessor(Scanner teclado, Professor[] professores) {

		System.out.println("Digite o CPF pelo qual você quer remover: ");
		String cpfConsultadoRemocao = teclado.next();

		for (int i = 0; i < professores.length; i++) {

			if (professores[i] != null && professores[i].getCpf().equals(cpfConsultadoRemocao)) {
				professores[i] = null;
				return true;
			}

		}

		return false;
	}

	public static boolean removeCoordenador(Scanner teclado, Coordenador[] coordenadores) {

		System.out.println("Digite o CPF pelo qual você quer remover: ");
		String cpfConsultadoRemocao = teclado.next();

		for (int i = 0; i < coordenadores.length; i++) {

			if (coordenadores[i] != null && coordenadores[i].getCpf().equals(cpfConsultadoRemocao)) {
				coordenadores[i] = null;
				return true;
			}

		}

		return false;
	}
	
	public static boolean removeAdministrativo(Scanner teclado, FuncionarioAdministrativo[] funcionariosAdm) {

		System.out.println("Digite o CPF pelo qual você quer remover: ");
		String cpfConsultadoRemocao = teclado.next();

		for (int i = 0; i < funcionariosAdm.length; i++) {

			if (funcionariosAdm[i] != null && funcionariosAdm[i].getCpf().equals(cpfConsultadoRemocao)) {
				funcionariosAdm[i] = null;
				return true;
			}

		}

		return false;
	}

	public static void menuProfessores(Scanner teclado, Professor[] professores) {

		int opcaoMenuProfessores = 0;
		do {
			System.out.println("\n--- Menu de professores ---\n");
			System.out.println("[1] - Cadastrar um professor");
			System.out.println("[2] - Listar todos os professores");
			System.out.println("[3] - Consultar professor por CPF");
			System.out.println("[4] - Remover um professor");
			System.out.println("[5] - Aumentar o salário");
			System.out.println("[0] - Voltar ao menu anterior");
			opcaoMenuProfessores = teclado.nextInt();

			switch (opcaoMenuProfessores) {
			case 1:
				System.out.println("-- Cadastra professor --");
				if (cadastraProfessor(teclado, professores)) {
					System.out.println("Cadastro realizado com sucesso!");
				} else {
					System.out.println("Falha ao cadastra professor!");
				}
				break;
			case 2:
				System.out.println("-- Professores Cadastrados --");
				listaProfessores(professores);
				System.out.println("----");
				break;
			case 3:
				System.out.println("-- Consulta professor --");
				Professor professorConsultado = buscaProfessor(teclado, professores);
				if (professorConsultado != null) {
					System.out.println(professorConsultado);
				} else {
					System.out.println("Professor não encontrado!");
				}
				break;
			case 4:
				System.out.println("-- Remove professor --");
				if (removeProfessor(teclado, professores)) {
					System.out.println("Professor removido com sucesso!");
				} else {
					System.out.println("Professor não encontrado!");
				}
				break;

			case 5:
				System.out.println("-- Aumento de salário --");
				Professor professorAumento = buscaProfessor(teclado, professores);
				if (professorAumento != null) {
					professorAumento.aumentaSalario();
					System.out.println("Salário do " + professorAumento.getNome() + " aumentado com sucesso!");
				} else {
					System.out.println("Professor não encontrado!");
				}
			case 0:
				System.out.println("Voltando ao menu anterior!");
				break;
			default:
				System.out.println("Menu professores -> Opção inválida");
			}

		} while (opcaoMenuProfessores != 0);

	}

	public static void menuCoordenadores(Scanner teclado, Coordenador[] coordenadores) {

		int opcaoMenuCoordenadores = 0;
		do {
			System.out.println("\n--- Menu de Coordenadores ---\n");
			System.out.println("[1] - Cadastrar um Coordenador");
			System.out.println("[2] - Listar todos os Coordenadores");
			System.out.println("[3] - Consultar Coordenador por CPF");
			System.out.println("[4] - Remover um Coordenador");
			System.out.println("[5] - Aumentar o salário");
			System.out.println("[0] - Voltar ao menu anterior");
			opcaoMenuCoordenadores = teclado.nextInt();

			switch (opcaoMenuCoordenadores) {
			case 1:
				System.out.println("-- Cadastra Coordenador --");
				if (cadastraCoordenador(teclado, coordenadores)) {
					System.out.println("Cadastro realizado com sucesso!");
				} else {
					System.out.println("Falha ao cadastrar Coordenador!");
				}
				break;
			case 2:
				System.out.println("-- Coordenadores Cadastrados --");
				listaCoordenadores(coordenadores);
				System.out.println("----");
				break;
			case 3:
				System.out.println("-- Consulta Coordenador --");
				Coordenador coordenadorConsultado = buscaCoordenador(teclado, coordenadores);
				if (coordenadorConsultado != null) {
					System.out.println(coordenadorConsultado);
				} else {
					System.out.println("Coordenador não encontrado!");
				}
				break;
			case 4:
				System.out.println("-- Remove Coordenador --");
				if (removeCoordenador(teclado, coordenadores)) {
					System.out.println("Coordenador removido com sucesso!");
				} else {
					System.out.println("Coordenador não encontrado!");
				}
				break;

			case 5:
				System.out.println("-- Aumento de salário --");
				Coordenador coordenadorAumento = buscaCoordenador(teclado, coordenadores);
				if (coordenadorAumento != null) {
					coordenadorAumento.aumentaSalario();
					System.out.println("Salário do " + coordenadorAumento.getNome() + " aumentado com sucesso!");
				} else {
					System.out.println("Coordenador não encontrado!");
				}
			case 0:
				System.out.println("Voltando ao menu anterior!");
				break;
			default:
				System.out.println("Menu Coordenadores -> Opção inválida");
			}

		} while (opcaoMenuCoordenadores != 0);

	}

	public static void menuFuncionariosAdm(Scanner teclado, FuncionarioAdministrativo[] funcionariosAdm) {

		int opcaoMenuAdministrativos = 0;
		do {
			System.out.println("\n--- Menu de Funcionários Administrativos ---\n");
			System.out.println("[1] - Cadastrar um Administrativo");
			System.out.println("[2] - Listar todos os Administrativos");
			System.out.println("[3] - Consultar o Administrativo por CPF");
			System.out.println("[4] - Remover um Administrativo");
			System.out.println("[5] - Aumentar o salário");
			System.out.println("[0] - Voltar ao menu anterior");
			opcaoMenuAdministrativos = teclado.nextInt();

			switch (opcaoMenuAdministrativos) {
			case 1:
				System.out.print("\n-- Cadastra Administrativo --\n");
				if (cadastraAdministrativo(teclado, funcionariosAdm)) {
					System.out.println("Cadastro realizado com sucesso!");
				} else {
					System.out.println("Falha ao cadastrar Administrativo!");
				}
				break;
			case 2:
				System.out.print("\n-- Administrativos cadastrados Cadastrados --\n");
				listaAdministrativos(funcionariosAdm);
				System.out.println("----");
				break;
			case 3:
				System.out.println("-- Consulta Administrativo --");
				FuncionarioAdministrativo administrativoConsultado = buscaAdministrativo(teclado, funcionariosAdm);
				if (administrativoConsultado != null) {
					System.out.println(administrativoConsultado);
				} else {
					System.out.println("Administrativo não encontrado!");
				}
				break;
			case 4:
				System.out.println("-- Remove Administrativo --");
				if (removeAdministrativo(teclado, funcionariosAdm)) {
					System.out.println("Administrativo removido com sucesso!");
				} else {
					System.out.println("Administrativo não encontrado!");
				}
				break;

			case 5:
				System.out.println("-- Aumento de salário --");
				FuncionarioAdministrativo AdministrativoAumento = buscaAdministrativo(teclado, funcionariosAdm);
				if (AdministrativoAumento != null) {
					AdministrativoAumento.aumentaSalario();
					System.out.println("Salário do " + AdministrativoAumento.getNome() + " aumentado com sucesso!");
				} else {
					System.out.println("Professor não encontrado!");
				}
			case 0:
				System.out.println("Voltando ao menu anterior!");
				break;
			default:
				System.out.println("Menu professores -> Opção inválida");
			}

		} while (opcaoMenuAdministrativos != 0);

	}

	private static void imprimirFolha(Professor[] professores, Coordenador[] coordenadores,
			FuncionarioAdministrativo[] funcionariosAdm) {

		System.out.println("--- FOLHA DE PAGAMENTO ---");
		System.out.println("--- Professores ---");

		double total = 0;
		for (Professor professor : professores) {
			if (professor != null) {
				total += professor.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", professor.getNome(), professor.getSalario());
			}
		}

		System.out.println("\n--- Coordenadores ---");
		for (Coordenador coordenador : coordenadores) {
			if (coordenador != null) {
				total += coordenador.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", coordenador.getNome(), coordenador.getSalario());
			}
		}

		System.out.println("\n--- Funcionários Administrativos ---");
		for (FuncionarioAdministrativo funcionarioAdm : funcionariosAdm) {
			if (funcionarioAdm != null) {
				total += funcionarioAdm.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", funcionarioAdm.getNome(),
						funcionarioAdm.getSalario());
			}
		}

		System.out.printf("\nTotal de pagamentos deste mês ----------- R$%.2f\n", total);
	}

	public static void main(String[] args) {
		// Sistema pra gerir a universidade
		// Inicializar a universidade (especificar quantos profissionais ela tem
		// (professores, coordenadores e func Administrativos)

		// Manter (cadastrar, consultar e remover) Professores
		// Manter (cadastrar, consultar e remover) Coordenadores
		// Manter (cadastrar, consultar e remover) FuncionariosAdministrativos

		// Aumentar o salário de um funcionário pelo seu cpf
		// Imprimir a folha de pagamento da universidade
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- UNIVERSIDADE QEEP MOVING ---");
		System.out.print("\nQuantos professores podem existir na sua universidade? ");
		int qtdProfessores = teclado.nextInt();
		System.out.print("\nQuantos cordenadores podem existir na sua universidade? ");
		int qtdCoordenadores = teclado.nextInt();
		System.out.print("\nQuantos funcionários administrativos podem existir na sua universidade? ");
		int qtdFuncionariosAdm = teclado.nextInt();

		// Inicializando os arrays que servirão como controle.
		Professor[] professores = new Professor[qtdProfessores];
		Coordenador[] coordenadores = new Coordenador[qtdCoordenadores];
		FuncionarioAdministrativo[] funcionariosAdm = new FuncionarioAdministrativo[qtdFuncionariosAdm];

		int opcaoMenuPrincipal = 0;
		do {
			System.out.println("\n--- Funcionalidades por tipo de funcionario ---\n");
			System.out.println("[1] - Professores");
			System.out.println("[2] - Coordenadores");
			System.out.println("[3] - Funcionários Administrativos");
			System.out.println("[4] - Imprimir folha de pagamento");
			System.out.println("[0] - Para encerrar");

			opcaoMenuPrincipal = teclado.nextInt();

			switch (opcaoMenuPrincipal) {
			case 1:
				menuProfessores(teclado, professores);
				break;
			case 2:
				menuCoordenadores(teclado, coordenadores);
				break;
			case 3:
				menuFuncionariosAdm(teclado, funcionariosAdm);
				break;
			case 4:
				imprimirFolha(professores, coordenadores, funcionariosAdm);
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcaoMenuPrincipal != 0);

		teclado.close();
	}

}