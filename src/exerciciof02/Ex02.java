package exerciciof02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		2 - Faça um programa que leia uma lista de inteiros e, a partir
//		dela, construa uma outra lista que contém os mesmos
//		elementos da primeira porém em ordem invertida. Em
//		seguida, as duas listas serão mostradas na tela.
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int tam;
		
		System.out.println("Digite o tamanho da Lista: ");
		tam = scan.nextInt();
		preencher(lista1, tam);
		
		lista2.addAll(lista1);
		lista2.sort(Comparator.reverseOrder());
		
		System.out.println("Lista 1:\n"+lista1);
		System.out.println("Lista 2:\n"+lista2);
		
		scan.close();
	}

	private static void preencher(ArrayList<Integer> lista, int tam) {
		for(int i=0;i<tam;i++) {
			int num = (int)(Math.random()*101);
			lista.add(num);
		}
		
	}

}
