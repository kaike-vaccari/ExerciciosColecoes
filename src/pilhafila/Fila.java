package pilhafila;

import java.util.LinkedList;

public class Fila {
	private LinkedList<Integer> fila;
	
	public Fila() {
		this.fila = new LinkedList<Integer>();
	}
	
	// Verificar Vazia
	public boolean isEmpty() {
		return this.fila.isEmpty();
	}
	
	// Enfileirar
	public void enqueue(int num) {
		this.fila.addLast(num);
	}
	
	// Desenfileirar
	public Integer dequeue() {
		if(this.fila.isEmpty()) {
			return null;
		}
		return this.fila.removeFirst();
	}
	
	// Tamanho
	public int size() {
		return this.fila.size();
	}
	
	// Primeiro Elemento
	public Integer peek() {
		if(this.fila.isEmpty()) {
			return null;
		}
		return this.fila.getFirst();
	}
}
