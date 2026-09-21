package pilhafila;

import java.util.LinkedList;

public class Pilha {
	private LinkedList<Integer> pilha;

	public Pilha(LinkedList<Integer> pilha) {
		this.pilha = new LinkedList<Integer>();
	}
	
	// Verificar Vazia
	public boolean isEmpty() {
		return this.pilha.isEmpty();
	}
	
	// Empilhar
	public void push(int num) {
		this.pilha.addFirst(num);
	}
	
	// Desenpilhar
	public Integer pop() {
		if(this.pilha.isEmpty()) {
			return null;
		}
		return this.pilha.removeFirst();
	}
	
	// Tamanho
	public int size() {
		return this.pilha.size();
	}
	
	// Retorna o ultimo
	public Integer top() {
		if(this.pilha.isEmpty()) {
			return null;
		}
		return this.pilha.getFirst();
	}
}
