package exercicio01Interface;

public class Preguica implements Animal{
	
	public void idadeNome() {
		System.out.println("O nome dele � Dom e ele est� com 2 anos");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Dom est� se sentindo angustiado, emitindo balidos de tristeza");
	}
	
	@Override
	public void correr() {
	}

	@Override
	public void subirArvore() {		
		System.out.println("O Dom est� subindo na �rvore");
	}
}
