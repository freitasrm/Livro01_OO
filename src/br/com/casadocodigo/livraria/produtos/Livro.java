package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;
		
	public Livro(Autor autor) {
		
		if(autor == null) {
			throw new AutorNuloException(
					"O Autor do Livro não pode ser nulo");
		}
		
		this.isbn = "000-00-00000-00-0";
		this.autor = autor;
		
	}
	
	@Override
	public String toString() {
		String autorLocal = "";
		if(this.temAutor()) {
			  autorLocal = autor.toString();
		}

		return	"Mostrando detalhes do livro " +
				"\nNome: " + nome +
				"\nDescrição: " + descricao +
				"\nValor: " + valor +
				"\nISBN: " + isbn +
				"\n" + autorLocal +
				"--";
	}
	
	@Override
	public int compareTo(Produto outro) {
		return Integer.compare((int)this.getValor(),(int)outro.getValor());
	}
		
	public boolean temAutor() {
		return this.autor != null;
			 
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
