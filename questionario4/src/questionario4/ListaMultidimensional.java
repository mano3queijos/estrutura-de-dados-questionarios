package questionario4;

import java.util.Scanner;

public class ListaMultidimensional {

	static Integer[][] lmd = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }/* , { 10, 11, 12 } */ };

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// dava pra criar um menu, e aqui seria tipo uma classe tui
		ListarElementos();
//		adicionarElementoNoFinal();
//		ListarElementos();
//		System.out.println("-------------------");
//		inverterOrdemDaLista();
//		ListarElementos();
//		adicionaListaNoFinalDaLista();
//		ListarElementos();
		eliminarPrimeiroElementoDaLista();
		ListarElementos();
	}

	// adicionar elemento no final da lista
	public static void adicionarElementoNoFinal() {
		System.out.println("Informe o elemento que deseja adicionar a lista");
		Integer novoElemento = scan.nextInt();
		Integer[][] listaTemporaria = new Integer[lmd.length][lmd[0].length + 1];
		for (int i = 0; i < lmd.length; i++) {
			for (int j = 0; j < lmd[i].length; j++) {

				listaTemporaria[i][j] = lmd[i][j];

			}

		}
//		novaLista[lmd.length][lmd.length-3] = novoElemento;
		listaTemporaria[lmd.length - 1][lmd.length] = novoElemento;

		lmd = listaTemporaria;

	}

	// elimiar primeiro eleemnto da lsita
	public static void eliminarPrimeiroElementoDaLista() {

		lmd[0][0] = null;
	}

	// adiciona uma lista no final da lista
	public static void adicionaListaNoFinalDaLista() {

		Integer[][] listaAdd = { { 10, 11, 12 }, { 13, 14, 15 } };

		Integer[][] listaTemporaria = new Integer[lmd.length + listaAdd.length][lmd[0].length];
		for (int i = 0; i < lmd.length; i++) {
			for (int j = 0; j < lmd[i].length; j++) {
				listaTemporaria[i][j] = lmd[i][j];
			}

		}
		for (int i = 0; i < listaAdd.length; i++) {
			for (int j = 0; j < listaAdd[i].length; j++) {
				listaTemporaria[lmd.length + i][j] = listaAdd[i][j];
			}
		}
		lmd = listaTemporaria;

	}

// Inverte a ordem da lista
	public static void inverterOrdemDaLista() {

		for (int i = 0; i < lmd.length / 2; i++) {
			Integer[] temp = lmd[i];
			lmd[i] = lmd[lmd.length - i - 1];
			lmd[lmd.length - i - 1] = temp;
		}
	}

	// lista elementos da lista

	public static void ListarElementos() {

		for (int i = 0; i < lmd.length; i++) {
			for (int j = 0; j < lmd[i].length; j++) {
				System.out.print("      " + lmd[i][j]);

			}
			System.out.println("\n");
		}

	}
}
