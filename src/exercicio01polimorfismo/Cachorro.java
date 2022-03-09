package exercicio01polimorfismo;
import java.util.Scanner;

public class Cachorro extends Animal{
	
	int idade;
	String nome;
	
	public void scan() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome do Cachorro --> ");
		nome = teclado.next();
		System.out.print("Informe a idade do Cachorro -> ");
		idade = teclado.nextInt();
		teclado.close();
	}
	public void idadeNome(String nome, int idade) {
		System.out.println("O nome dele é "+nome+" e ele tem "+idade+" anos");
	}
	
	public void emitirSom(String nome) {
		System.out.println("O "+nome+" está latindo muito!");
	}
	
	public void correr(String nome) {
		System.out.println("O "+nome+" está correndo demais!");
	}
	
}
