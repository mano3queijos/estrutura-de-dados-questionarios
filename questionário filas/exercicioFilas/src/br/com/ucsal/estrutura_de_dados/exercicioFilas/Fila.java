package br.com.ucsal.estrutura_de_dados.exercicioFilas;

public class Fila {

	public class No {
		String info;
		No proximo;
	}

	No inicio;
	No cabeca;
	Integer tamanho;

	public Fila(No inicio, No cabeca, Integer tamanho) {
		super();
		this.inicio = inicio;
		this.cabeca = cabeca;
		this.tamanho = tamanho;
	}

// Inicialização de uma fila vazia
	public Fila() {
		cabeca = null;
		inicio = null;
		tamanho = 0;
	}

	public Integer size() {
		return this.tamanho;
	}

	public String front() {
		if (cabeca == null) {
			return null;
		}
		return cabeca.info;
	}

	public boolean isEmpty() {
		return inicio == null;
	}

	public void enqueue(String info) {
		No no = new No();
		no.info = info;
		no.proximo = inicio;
		inicio = no;
		if (tamanho == 0) {
			// Lista vazia
			cabeca = no;
		}
		tamanho++;
	}

	public String dequeue() {
		if (isEmpty()) {
			return null;
		}
		String info = cabeca.info;
		if (tamanho == 1) {
			inicio = null;
			cabeca = null;
		} else {
			No local = inicio;
			while (local.proximo != cabeca) {
				local = local.proximo;
			}
			cabeca = local;
			cabeca.proximo = null;
			tamanho--;
		}
		return info;
	}
}
