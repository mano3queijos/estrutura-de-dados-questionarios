/*
 * 
 * 
 * 
 * @emanuelAP
 * https://github.com/mano3queijos
 * 
 * 
 */
package br.com.ucsal.bes.estruturadedados2023.questionario01.quest03;

import java.util.Scanner;

public class CalculoMdc {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("numero 1 mdc");
		Integer num01 = scan.nextInt();
		System.out.println("numero 2 mdc");
		Integer num02 = scan.nextInt();
		
		System.out.println(mdc(num01, num02));
	}
	
	
	public static Integer mdc(Integer num01, Integer num02) {
		
		System.out.println(num01 + "  " + num02);
		return (num02 == 0)? num01 : mdc(num02, num01%num02); 
		
	}
}
