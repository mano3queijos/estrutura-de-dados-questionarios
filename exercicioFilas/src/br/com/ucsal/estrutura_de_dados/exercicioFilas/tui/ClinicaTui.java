package br.com.ucsal.estrutura_de_dados.exercicioFilas.tui;

import java.util.Scanner;

import br.com.ucsal.estrutura_de_dados.exercicioFilas.Fila;

public class ClinicaTui {
	static Fila fila = new Fila();

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		exibirManu();

	}

	public static void adicionarPaciente() {
		System.out.println("Informe o nome do paciente que deseja adicionar");
		scan.nextLine();
		String nome = scan.nextLine();
		fila.enqueue(nome);
	}

	public static void verificarFila() {

		if (fila.isEmpty()) {
			System.out.println("A fila ta vazia");
		} else {
			System.out.println("A fila não ta vazia");
		}
	}

	public static void chamarProximoPaciente() {
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia");
		} else {
			System.out.println("Proximo paciente: " + fila.front());
			fila.dequeue();
		}
	}

	public static void exibirManu() {

		for (;;) {
			System.out.println("====Menu====");
			System.out.println("1. Adicionar paciente ");
			System.out.println("2. Chamar paciente para ser atendido ");
			System.out.println("3. Verificar se tem algum paciente na fila");
			System.out.println("4. verificar proximo paciente a ser atendido");
			System.out.println("5. Informar quantos pacientes esxistem na fila");
			Integer key = scan.nextInt();
			switch (key) {
			case 1: {
				adicionarPaciente();
				break;
			}
			case 2: {
				chamarProximoPaciente();
				break;
			}
			case 3: {
				verificarFila();
				break;
			}
			case 4: {
				verificarProximoPaciente();

				break;
			}
			case 5: {
				qtdPacientesFila();
				break;
			}
			default:
				System.out.println("Valor inserido invalido meu nobre");
			}
		}
	}

	public static void qtdPacientesFila() {
		System.out.println("Quantidade de pacientes da fila:" + fila.size());

	}

	public static void verificarProximoPaciente() {

		if (fila.isEmpty()) {
			System.out.println("A lista ta vazia");
		} else {
			System.out.println("Proximo paciente: " + fila.front());

		}

	}

}
