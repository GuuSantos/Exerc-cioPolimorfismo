package exercicio01Interface;

public class Cavalo implements Animal{
	
	public void idadeNome() {
		System.out.println("O nome dele � P� de Pano e ele est� com 10 anos");
	}

	@Override
	public void emitirSom() {
		System.out.println("O P� de Pano est� bufando");
	}
	
	@Override
	public void correr() {
		System.out.println("O P� de Pano est� galopando r�pido demais");
	}

	@Override
	public void subirArvore() {		
	}
	
}
