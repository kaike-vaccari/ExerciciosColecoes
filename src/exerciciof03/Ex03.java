package exerciciof03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		3 - Faça um programa que leia duas listas de inteiros e, a
//		partir delas, construa uma terceira lista com os elementos
//		das duas primeiras intercalados. Em seguida, as três listas
//		serão mostradas na tela.
//		Por exemplo: [1,2,3] [4, 5, 6] ==> [1,4,2,5,3,6]
//		[1,2,3] [4] ==> [1,4,2,3]
//		[] [8,5,10] ==> [8,5,10]
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> listaIntercalada = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int tam1, tam2;
		
		System.out.println("Tamanho da Lista 1: ");
		tam1 = scan.nextInt();
		preencher(lista1, tam1);
		
		System.out.println("Tamanho da Lista 2: ");
		tam2 = scan.nextInt();
		preencher(lista2, tam2);
		
		intercalar(listaIntercalada, lista1, lista2);
		
		System.out.println("Lista 1:\n"+lista1);
		System.out.println("Lista 2:\n"+lista2);
		System.out.println("Lista Intercalada:\n"+listaIntercalada);
		
		scan.close();
	}

	private static void preencher(ArrayList<Integer> lista, int tam) {
		for(int i=0;i<tam;i++) {
			int num = (int)(Math.random()*101);
			lista.add(num);
		}
		
	}

	private static void intercalar(ArrayList<Integer> listaIntercalada, ArrayList<Integer> lista1,
			ArrayList<Integer> lista2) {
		int tamMax = lista1.size() + lista2.size();
		
		for(int i=0;i<tamMax;i++) {
			if(i<lista1.size()) {
				listaIntercalada.add(lista1.get(i));
			}
			if(i<lista2.size()) {
				listaIntercalada.add(lista2.get(i));
			}
		}
		
	}

	

}
