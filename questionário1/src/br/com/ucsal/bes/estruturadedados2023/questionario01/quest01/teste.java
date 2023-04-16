/*
 * 
 * 
 * 
 * @emanuelAP
 * https://github.com/mano3queijos
 * 
 * 
 */
package br.com.ucsal.bes.estruturadedados2023.questionario01.quest01;

import java.util.Scanner;

import br.com.ucsal.bes.estruturadedados2023.questionario01.quest01.domain.ContaBancaria;
import br.com.ucsal.bes.estruturadedados2023.questionario01.quest01.exception.ContaBacariaException;

public class teste {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ContaBancaria cb = new ContaBancaria(1000.10);

		
		System.out.println(cb.getSaldo());
		System.out.println("dep");
		Double saldo = 30.0;
		
		
		
		cb.depositar(saldo);
		cb.atualizarSaldoAposDeposito(saldo);
		
		System.out.println(cb);
		try {
			
			cb.scarDinheiro(20.0);
			System.out.println(cb);
		cb.atualizarSaldoAposSaque(20.0);

			

			cb.scarDinheiro(10000000.0);
			
			
		} catch (ContaBacariaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(cb);
		
		
	}

}
