package exercicio01polimorfismo;

public class TesteAnimal extends Animal{
	//		System.out.println("O nome do Cachorro é --> "+nome+" e ele tem "+idade+" anos");
	 int idade;
	 String nome;
	
	public static void main(String[] args) {
		Cachorro a = new Cachorro();
		a.scan();
		a.idadeNome(a.nome, a.idade);
		a.correr(a.nome);
		a.emitirSom(a.nome);
		
		
		System.out.println("\n===============================\n");
		Cavalo c = new Cavalo();
		c.scan();
		c.idadeNome(c.nome, c.idade);
		c.correr(c.nome);
		c.emitirSom(c.nome);
		
		
		System.out.println("\n===============================\n");
		Preguica p = new Preguica();
		p.scan();
		p.idadeNome(p.nome, p.idade);
		p.subirArvore(p.nome);
		p.emitirSom(p.nome);
		
		
	}

	public void emitindoSom(Animal animal) {
		animal.emitirSom(nome);
	}
	
	public void subindoArvore(Animal animal) {
		animal.subirArvore(nome);;
	}
	
	public void correndo(Animal animal) {
		animal.correr(nome);
	}
	
	


}
