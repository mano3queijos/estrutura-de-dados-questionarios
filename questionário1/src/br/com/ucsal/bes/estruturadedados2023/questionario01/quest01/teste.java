package br.com.ucsal.bes.estruturadedados2023.questionario01.quest01;

import java.util.Scanner;

import br.com.ucsal.bes.estruturadedados2023.questionario01.quest01.domain.ContaBancaria;
import br.com.ucsal.bes.estruturadedados2023.questionario01.quest01.exception.ContaBacariaException;

public class teste {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ContaBancaria cb = new ContaBancaria(1000.10);

		
		System.out.println(cb.getSaldo());
		System.out.println("Informe o Saldo da conta bancarioa");
		Double saldo = scan.nextDouble();
		
		System.out.println(saldo);
		
		cb.depositar(saldo);
		
	

		
		System.out.println(cb);
		try {
			cb.scarDinheiro(20.0);
		} catch (ContaBacariaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(cb);
		
		
	}

}
