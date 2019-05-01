package livraria;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro mLivro = new MiniLivro(autor);
		mLivro.setValor(39.90);
		
		System.out.println("Valor atual: "+mLivro.getValor());
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: "+livro.getValor());
		
		if(!livro.aplicaDescontoDe10PorCento()) {
			System.out.println("Desconto não pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 15%");
		} else {
			System.out.println("Valor com desconto: " + ebook.getValor());
		}
		
	}
}
