package livraria;

public class MeuPrimeiroPrograma {
	public static void main(String[] args) {
 		System.out.println("O primeiro de muitos!");
		
		int numero = 4;
		int outroNumeroIgual = numero;
		numero = numero + 5;
		
		System.out.println(numero);
		System.out.println(outroNumeroIgual);
		
		for(int i =0; i <= 10; i++) {
			if(i==7) {
				continue;
			}
			
			System.out.println(i);
		}
		
		for(int i =0; i <= 10; i++) {
			if(i==7) {
				break;
			}
			
			System.out.println(i);
		}
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-10");

		Autor autor2 = new Autor();
		autor2.setNome("Paulo Silveira");
		autor2.setEmail("paulo.silveri@caelum.com.br");
		autor2.setCpf("123.456.789-10");

		if(autor == autor2) {
			System.out.println("Iguais, mesmo autor!");
		} else {
			System.out.println("hein?! Por que diferentes?");
		}
		
		Livro livro = new Livro(autor);
		livro.getAutor().setNome("Guilherme Silveira");
		System.out.println(livro.getAutor().getNome());
		
		}
}


