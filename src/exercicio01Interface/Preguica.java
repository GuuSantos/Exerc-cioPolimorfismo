package exercicio01Interface;

public class Preguica implements Animal{
	
	public void idadeNome() {
		System.out.println("O nome dele é Dom e ele está com 2 anos");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Dom está se sentindo angustiado, emitindo balidos de tristeza");
	}
	
	@Override
	public void correr() {
	}

	@Override
	public void subirArvore() {		
		System.out.println("O Dom está subindo na Árvore");
	}
}
