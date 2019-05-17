package br.com.casadocodigo.livraria.teste;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Drive Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Drive Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		
		List<Produto> produtos = carrinho.getProdutos();

		for(Produto produto : produtos) {
			if(produto != null) {
				System.out.println(produto.getValor());
			}
		}
		
		for(int i = 0; i < produtos.size(); i++) {
			try {
				Produto produto = produtos.get(i);
				if(produto != null) {
					System.out.println(produto.getValor());
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("deu excpetion no indice: " + i);
			} catch (NullPointerException e) {
				System.out.println("A array não foi estanciado!");
			}
		}
		
		
		System.out.println("Fui executado!");

		
		
		try {
			abreArquivo();
		} catch (FileNotFoundException e1) {
			System.out.println("Não consegui abrir o arquivo");
		}
		
		System.out.println(ebook);
		
		System.out.println(autor.getClass().getSimpleName());
		
		ArrayList lista = new ArrayList();
		String valor = "Conhecendo um arraylist";
		lista.add(valor);
		System.out.println(lista.contains(valor));
		lista.remove(valor);
		System.out.println(lista.contains(valor));
		
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Rodrigo Turini");
		nomes.add("Adriano Almeida");
		nomes.add("Paulo Silveira");
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		Livro livre = new LivroFisico(null);
		
	}

	public static void abreArquivo() throws FileNotFoundException{
		new java.io.FileInputStream("Arquivo.txt");
	}
	
}