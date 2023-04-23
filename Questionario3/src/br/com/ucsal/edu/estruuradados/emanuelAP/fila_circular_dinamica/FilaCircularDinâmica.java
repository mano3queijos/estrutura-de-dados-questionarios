package br.com.ucsal.edu.estruuradados.emanuelAP.fila_circular_dinamica;

public class FilaCircularDinâmica {

	NoFilaCircular inicio;
	NoFilaCircular fim;
	NoFilaCircular anterior;
	static Integer cont = 0;

	public FilaCircularDinâmica() {
		// TODO Auto-generated constructor stub
	}

//	inserir elementos a esquerda do inicio da fila circular
	public void inserirElementoEsquerda(Integer dado) {

		NoFilaCircular novo = new NoFilaCircular(dado);
		if (!vazia()) {
			novo.proximo = inicio;
			novo.anterior = fim;
			anterior = novo;
			fim.proximo = novo;
			inicio = novo;
			cont++;

		} else {
			System.out.println("A lista ta vazia");
			inicio = novo;
			fim = novo;
			fim.proximo = inicio;
			cont++;

		}

	}

	// concatena duas filas circulares
	public void concatena(FilaCircularDinâmica outra) {
		if (this.inicio == null || outra.inicio == null) {

			return;
		}

		NoFilaCircular fim = this.fim;
		NoFilaCircular inicio = outra.inicio;

		fim.proximo = inicio;
		inicio.anterior = fim;

		outra.inicio = this.inicio;
		this.fim = outra.fim;

	}

	// percorre e mostra os elementos da lista
	public void percorrerListaCircular() {
		if (vazia()) {
			System.out.println("A lista está vazia.");
		} else {
			NoFilaCircular aux = inicio;

			do {
				System.out.print(aux.dado + " ");
				aux = aux.proximo;

			} while (aux.dado != fim.dado);
			System.out.println();

		}
	}

// intercala duas listas ordenadas
	public void intercala(FilaCircularDinâmica fcd1, FilaCircularDinâmica fcd2) {
		NoFilaCircular aux1 = fcd1.inicio.proximo;
		NoFilaCircular aux2 = fcd2.inicio.proximo;

		if (fcd2.inicio.dado > fcd1.inicio.dado) {
			this.adicionarFila(fcd1.inicio.dado);
			this.adicionarFila(fcd2.inicio.dado);

		} else {
			this.adicionarFila(fcd2.inicio.dado);
			this.adicionarFila(fcd1.inicio.dado);

		}

//		this.adicionarFila(fcd2.inicio.dado);
//		this.adicionarFila(fcd1.inicio.dado);
		while (aux1 != fcd1.inicio && aux2 != fcd2.inicio) {

			if (aux1.dado < aux2.dado) {
				this.adicionarFila(aux1.dado);
				aux1 = aux1.proximo;
			} else {
				this.adicionarFila(aux2.dado);
				aux2 = aux2.proximo;
			}

		}
		while (aux1 != fcd1.inicio) {
			this.adicionarFila(aux1.dado);
			aux1 = aux1.proximo;
		}
		while (aux2 != fcd2.inicio) {
			this.adicionarFila(aux2.dado);
			aux2 = aux2.proximo;
		}
	}

	public void imprimirFila() {
		if (vazia()) {
			System.out.println("Fila vazia!");
			return;
		}
		NoFilaCircular aux = inicio;
		do {
			System.out.print(aux.dado + " ");
			aux = aux.proximo;
		} while (aux != inicio);
		System.out.println();
	}

	// adiciona elementos a lista circular
	public void adicionarFila(int dado) {

		NoFilaCircular novo = new NoFilaCircular(dado);
		if (this.vazia()) {
			inicio = novo;
			fim = novo;
			fim.proximo = inicio;

		} else {
			novo.proximo = inicio;
			fim.proximo = novo;
			fim = novo;
			cont++;

		}
	}

	// faz uma copia da lista
	public FilaCircularDinâmica copia() {

		FilaCircularDinâmica copia = new FilaCircularDinâmica();
		if (inicio == null) {
			return copia;

		}

		NoFilaCircular aux = this.inicio.proximo;
		copia.adicionarFila(this.inicio.dado);
		while (aux != inicio) {

			copia.adicionarFila(aux.dado);
			aux = aux.proximo;
		}

		return copia;
	}

	public boolean vazia() {
		return inicio == null && fim == null;
	}

	public int removerFila() {
		int removido;
		if (vazia()) {
			removido = -1;
		} else if (inicio == fim) {
			removido = inicio.dado;
			inicio = null;
			fim = null;
		} else {
			removido = inicio.dado;
			fim = inicio;
			inicio = inicio.proximo;
			fim.proximo = inicio;
		}
		return removido;
	}

	public String toString() {
		String listados = "Numeros" + "\n";
		int numero = 1;
		if (this.vazia()) {
			return listados = "Não foi possivel encontrar valores cadastrados";
		} else if (this.inicio == this.fim) {
			listados = listados + numero + " - " + this.inicio.dado;
		} else {
			NoFilaCircular aux = this.inicio;
			if (aux == this.fim.proximo) {
				listados = listados + numero + " - " + aux.dado + "\n";
				aux = aux.proximo;
				numero++;
			}
			while (aux != this.fim.proximo) {
				listados = listados + numero + " - " + aux.dado + "\n";
				aux = aux.proximo;
				numero++;
			}
		}
		return listados;
	}

}