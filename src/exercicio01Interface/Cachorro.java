package exercicio01Interface;

public class Cachorro implements Animal{
	
	public void idadeNome() {
		System.out.println("O nome dele é Rex e ele está com 8 anos");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Rex está latindo");
	}
	
	@Override
	public void correr() {
		System.out.println("O Rex está correndo");
	}

	@Override
	public void subirArvore() {		
	}
	
}
