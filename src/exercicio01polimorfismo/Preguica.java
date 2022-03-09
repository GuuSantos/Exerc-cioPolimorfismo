package exercicio01polimorfismo;

import java.util.Scanner;

public class Preguica extends Animal{
	
	
	public void scan() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome da Pregui�a --> ");
		nome = teclado.next();
		System.out.print("Informe a idade da Pregui�a -> ");
		idade = teclado.nextInt();
		teclado.close();
	}
	
	public void idadeNome(String nome, int idade){
		System.out.println("O nome da Pregui�a � "+nome+" e ele tem "+idade+" anos");
	}
	
	public void emitirSom(String nome) {
		System.out.println("O "+nome+" est� muito ansioso, emitindo balidos de tristeza!");
	}
	
	public void subirArvore(String nome) {
		System.out.println("O "+nome+" est� subindo na �rvore mais alta...");
	}
	
}
