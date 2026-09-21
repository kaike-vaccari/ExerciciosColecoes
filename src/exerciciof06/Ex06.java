package exerciciof06;

import java.util.ArrayList;
import java.util.Scanner;

import pilhafila.Fila;

public class Ex06 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//		6 - Escreva um programa que leia vários inteiros, coloque em
		//		uma fila. Em seguida, retire todos os números iguais da fila.
		Fila fila = new Fila();

		System.out.println("Você irá preencher a Fila: ");
		preencher(fila);
		retirarIguais(fila);
		System.out.println("Fila Final: ");
		mostrarFila(fila);
		
		scan.close();
	}
	private static void preencher(Fila fila) {
		int tam, num;
		
		System.out.println("Entre com o tamanho da Fila: ");
		tam = scan.nextInt();
		for(int i=0;i<tam;i++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			fila.enqueue(num);
		}
	}
	private static void retirarIguais(Fila fila) {
		ArrayList<Integer> arrayAux = new ArrayList<>();
		
		System.out.println("Fila Inicial: ");
		mostrarFila(fila);
		while(fila.size()!=0) {
			int elemento = fila.dequeue();
			if(!arrayAux.contains(elemento)) {
				arrayAux.add(elemento);
			}
		}
		for(int i : arrayAux) {
			fila.enqueue(i);
		}
	}
	
	private static void mostrarFila(Fila fila) {
		Fila filaAux = new Fila();
		while(fila.size()!=0) {
			int elemento = fila.dequeue();
			System.out.println("| "+elemento+" |");
			filaAux.enqueue(elemento);
		}
		while(filaAux.size()!=0) {
			fila.enqueue(filaAux.dequeue());
		}
	}
}


