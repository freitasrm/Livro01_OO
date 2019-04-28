package livraria;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.adicionaValor(59.90);
		
		System.out.println("Valor atual: "+livro.retornaValor());
		
		if(!livro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto n�o pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.retornaValor());
		}
	}
}
