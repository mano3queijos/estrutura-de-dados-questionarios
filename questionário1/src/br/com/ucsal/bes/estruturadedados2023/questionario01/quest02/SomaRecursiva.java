package br.com.ucsal.bes.estruturadedados2023.questionario01.quest02;

import java.util.Scanner;

public class SomaRecursiva {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe o numero inteiro positivo");
		Integer numero = scan.nextInt();
		System.out.println("soma"+somaRecursiva(numero));

	}

	public static Integer somaRecursiva(Integer numero) {
		System.out.println(numero);

		return (numero == 0) ? numero : numero + somaRecursiva(numero - 1);
	}
}
