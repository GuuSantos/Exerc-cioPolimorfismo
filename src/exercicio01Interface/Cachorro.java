package exercicio01Interface;

public class Cachorro implements Animal{
	
	public void idadeNome() {
		System.out.println("O nome dele � Rex e ele est� com 8 anos");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Rex est� latindo");
	}
	
	@Override
	public void correr() {
		System.out.println("O Rex est� correndo");
	}

	@Override
	public void subirArvore() {		
	}
	
}
