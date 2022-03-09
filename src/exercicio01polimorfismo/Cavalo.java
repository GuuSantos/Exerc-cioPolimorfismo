package exercicio01polimorfismo;

import java.util.Scanner;

public class Cavalo extends Animal{
	
	
	
	public void scan() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome do Cavalo --> ");
		nome = teclado.next();
		System.out.print("Informe a idade do Cavalo -> ");
		idade = teclado.nextInt();
		teclado.close();
	}
	public void idadeNome(String nome, int idade){
		System.out.println("O nome do Cavalo é "+nome+" e ele tem "+idade+" anos");
	}
	
	public void emitirSom(String nome) {
		System.out.println("O "+nome+" está bufando demais!");
	}
	
	public void correr(String nome) {
		System.out.println("O "+nome+" está galopando rapido demais!");
	}
}
