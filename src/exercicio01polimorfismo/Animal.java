package exercicio01polimorfismo;

import java.util.Scanner;

public  class Animal {
	
	int idade;
	String nome;
	
	
	public void scan() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome do animal --> ");
		nome = teclado.next();
		System.out.print("Informe a idade do animal -> ");
		idade = teclado.nextInt();
		teclado.close();
	}
	
	public void emitirSom(String nome) {
		System.out.println("O "+nome+" emitindo som...");
	}
	
	public void correr(String nome) {
		System.out.println("O "+nome+" está correndo...");
	}
	
	public void subirArvore(String nome) {
		System.out.println("O "+nome+" está subindo na árvore...");
	}
	
	
}
