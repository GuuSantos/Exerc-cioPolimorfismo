package exercicio01Interface;

public class Cavalo implements Animal{
	
	public void idadeNome() {
		System.out.println("O nome dele é Pé de Pano e ele está com 10 anos");
	}

	@Override
	public void emitirSom() {
		System.out.println("O Pé de Pano está bufando");
	}
	
	@Override
	public void correr() {
		System.out.println("O Pé de Pano está galopando rápido demais");
	}

	@Override
	public void subirArvore() {		
	}
	
}
