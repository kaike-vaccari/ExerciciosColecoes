package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		2 - Faça um programa que preencha uma LinkedList com
//		números inteiros (ele deve parar de armazenar quando
//		digitar zero), mostre a lista original na tela, peça ao usuário
//		um número e mostre na tela a quantidade de vezes esse
//		número aparece na lista
		ArrayList<Integer> lista = new ArrayList<>();
		int num;
		
		preencher(lista);
		System.out.println("Lista original: \n"+lista);
		
		System.out.println("\nDigite um número para procurar na lista: \n");
		num = scan.nextInt();
		
		int ocorrencias = contarOcorrencia(lista, num);
		
		System.out.println("O número de vezes que o número aparece é: "+ ocorrencias);
		
		scan.close();
	}

	private static void preencher(ArrayList<Integer> lista) {
		int num;
		
		do {
			System.out.println("Número para adicionar à lista: ");
			num = scan.nextInt();
			lista.add(num);
			
		}while(num!=0);
		
	}

	private static int contarOcorrencia(ArrayList<Integer> lista, int num) {
		int ocorrencias = 0;
		
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)==num) {
				ocorrencias++; // Conta as occorencias do número na lista
			}
		}
		if(ocorrencias==0) {
			return -1; // Retorna -1 caso não encontre nenhum número de ocorrencias no vetor
		}
		return ocorrencias;
	}

}
