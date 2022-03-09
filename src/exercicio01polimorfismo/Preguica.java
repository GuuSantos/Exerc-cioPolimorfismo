package exercicio01polimorfismo;

import java.util.Scanner;

public class Preguica extends Animal{
	
	
	public void scan() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome da Preguiça --> ");
		nome = teclado.next();
		System.out.print("Informe a idade da Preguiça -> ");
		idade = teclado.nextInt();
		teclado.close();
	}
	
	public void idadeNome(String nome, int idade){
		System.out.println("O nome da Preguiça é "+nome+" e ele tem "+idade+" anos");
	}
	
	public void emitirSom(String nome) {
		System.out.println("O "+nome+" está muito ansioso, emitindo balidos de tristeza!");
	}
	
	public void subirArvore(String nome) {
		System.out.println("O "+nome+" está subindo na árvore mais alta...");
	}
	
}
