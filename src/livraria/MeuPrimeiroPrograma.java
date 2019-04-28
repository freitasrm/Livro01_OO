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
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-10";

		Autor autor2 = new Autor();
		autor2.nome = "Paulo Silveira";
		autor2.email = "paulo.silveri@caelum.com.br";
		autor2.cpf = "123.456.789-10";

		if(autor == autor2) {
			System.out.println("Iguais, mesmo autor!");
		} else {
			System.out.println("hein?! Por que diferentes?");
		}
		
		Livro livro = new Livro();
		livro.autor = autor;
		livro.autor.nome = "Guilherme Silveira";
		System.out.println(livro.autor.nome);
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();
	}
}


