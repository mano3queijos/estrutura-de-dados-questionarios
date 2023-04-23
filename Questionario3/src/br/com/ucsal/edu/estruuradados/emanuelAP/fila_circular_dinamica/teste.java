package br.com.ucsal.edu.estruuradados.emanuelAP.fila_circular_dinamica;

public class teste {

	public static void main(String[] args) {

		FilaCircularDinâmica fcd = new FilaCircularDinâmica();

		fcd.adicionarFila(2);
		fcd.adicionarFila(3);
		fcd.adicionarFila(5);
		fcd.adicionarFila(7);

		System.out.println(fcd.toString());

		FilaCircularDinâmica fcd2 = new FilaCircularDinâmica();

		fcd2.adicionarFila(1);
		fcd2.adicionarFila(4);
		fcd2.adicionarFila(6);
		fcd2.adicionarFila(8);

		System.out.println(fcd2.toString());

//		fcd.concatena(fcd2);
//
//		System.out.println("Lista concatenada:");
//		fcd.percorrerListaCircular();

		System.out.println("Lista intercalada:");

		FilaCircularDinâmica fcd3 = new FilaCircularDinâmica();

		fcd3.intercala(fcd2, fcd);
		System.out.println(fcd3.toString());
//
//		FilaCircularDinâmica fcdCopiada = new FilaCircularDinâmica();
//		fcdCopiada = fcd.copia();
//
//		System.out.println("copia:");
//
//		System.out.println(fcd.toString());
//		
//		System.out.println(fcdCopiada.toString());
	}
}