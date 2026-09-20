package exerciciof01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		1 - Faça um programa que leia duas listas de inteiros e
//		preencha uma outra lista com todos os elementos das duas
//		listas originais, sem repetição e ordenados. Ao final, mostre
//		as três listas na tela. Por exemplo: [3,6,5,3,7] [2,9,7,5,1] ==>
//		[1,2,3,5,6,7,9]
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> listaMerge = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int tam1, tam2; // Tamanhos da lista 1 e 2
		System.out.println("Digite o tamanho da primeira Lista: ");
		tam1 = scan.nextInt();
		System.out.println("Digite o tamanho da segunda lista: ");
		tam2 = scan.nextInt();
		
		preencher(lista1, tam1);
		System.out.println("Lista 1:\n"+lista1);
		preencher(lista2, tam2);
		System.out.println("Lista 2:\n"+lista2);
		
		listaMerge.addAll(lista1);
		listaMerge.addAll(lista2);
		listaMerge.sort(Comparator.naturalOrder());
		System.out.println("Lista com final:\n"+listaMerge);
		scan.close();
		
	}

	private static void preencher(ArrayList<Integer> lista, int tam) {
		for(int i=0;i<tam;i++) {
			int num = (int) (Math.random()*101);
			lista.add(num);
		}
		
	}

}
