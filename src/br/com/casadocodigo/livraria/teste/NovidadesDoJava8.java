package br.com.casadocodigo.livraria.teste;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
	public static void main(String[] args) {
	
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático.");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		//java7
		//Collections.sort(livros, new ComparadorPorNome());
		
		//java7 - classe anônimas
		/*
		Collections.sort(livros, new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
				return l1.getNome().compareTo(l2.getNome());
			}
		});
		*/
		
		//java8 - sort em List
		/*
		livros.sort(new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
				return l1.getNome().compareTo(l2.getNome());
			}
		});
		*/
		
		//java8 - lambda completo
		/*
		livros.sort((Livro l1, Livro l2) -> {
			return l1.getNome().compareTo(l2.getNome());
		});
		*/
		
		
		//java8 - lambda na pratica
		/*
		livros.sort(
				(l1,l2) -> l1.getNome().compareTo(l2.getNome())
		);
		*/
		
		//java 8 - lambda 100%
		//livros.sort(Comparator.comparing(l -> l.getNome()));

		//java 8 - lambda 100% delegando chamada do método
		livros.sort(Comparator.comparing(Livro::getNome));

		// enhanced-for
		/*
		for (Livro livro : livros) {
			System.out.println(livro.getNome());
		}
		*/
		
		//java8 - forEach lambda
		livros.forEach(l -> System.out.println(l.getNome()));
		
		//java7
		/*
		List<Livro> filtrados = new ArrayList<Livro>();
		
		for(Livro livro : livros) {
			if(livro.getNome().contains("Java")) {
				filtrados.add(livro);
			}
		}
		
		filtrados.forEach(l -> System.out.println(l.getNome()));
		*/
		
		livros.stream()
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome())
		);
		
		
	}
}
