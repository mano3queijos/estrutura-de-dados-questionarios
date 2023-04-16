/*
 * 
 * 
 * 
 * @emanuelAP
 * https://github.com/mano3queijos
 * 
 * 
 */
package br.com.ucsal.bes.estruturadedados2023.questionario01.quest01.domain;

import br.com.ucsal.bes.estruturadedados2023.questionario01.quest01.exception.ContaBacariaException;

public class ContaBancaria {

	private Double saldo;

	public ContaBancaria(Double saldo2) {
		saldo = saldo2;
	}

	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public Double getSaldo() {

		return saldo;
	}

	public void depositar(Double valorDepositar) {

		saldo += valorDepositar;

	}

	public void scarDinheiro(Double ValorSacar) throws ContaBacariaException {
		if (ValorSacar > saldo) {
			throw new ContaBacariaException("O valor a sacar não pode ser maior do que o valor existente em conta");
		}
		saldo -= ValorSacar;
	}

	public void atualizarSaldoAposSaque(double valorAlterado) {
		System.out.println("Saldo antigo: " + (saldo + valorAlterado));
		System.out.println("Saldo atualizado" + this.saldo);
	}

	public void atualizarSaldoAposDeposito(double valorAlterado) {

		System.out.println("Saldo antigo: " + (saldo - valorAlterado));
		System.out.println("Saldo atualizado" + this.saldo);
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + "]";
	}

}
