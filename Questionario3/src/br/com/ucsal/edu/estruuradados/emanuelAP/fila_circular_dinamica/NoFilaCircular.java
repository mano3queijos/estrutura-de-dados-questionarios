package br.com.ucsal.edu.estruuradados.emanuelAP.fila_circular_dinamica;

public class NoFilaCircular {

	public int dado;
	public NoFilaCircular proximo;
	public NoFilaCircular anterior;
	

	public NoFilaCircular(int dado) {
		this.proximo = null;
		this.dado = dado;
		this.anterior = null;
	}



}