package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		1 - Faça um programa que preencha uma ArrayList com
//		números inteiros (ele deve parar de armazenar quando
//		digitar zero), mostre a lista original na tela, retire todos os
//		números pares da lista e imprima a lista final na tela
//		
		ArrayList<Integer> array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tam = scan.nextInt();
		
		preencher(array, tam);
		System.out.println("Vetor estágio inicial:\n"+array);
		
		System.out.println("\nAgora iremos remover os números pares...\n");
		array.removeIf(n -> n%2==0);
		System.out.println("Vetor depois da remoção dos números pares: \n"+array);

	}

	private static void preencher(ArrayList<Integer> array, int tam) {
		for(int i=0;i<tam;i++) {
			int num = (int) (Math.random()*101); // Preenche o vetor com números de 1 a 100
			array.add(num);
		}
		
	}
	
	

}
