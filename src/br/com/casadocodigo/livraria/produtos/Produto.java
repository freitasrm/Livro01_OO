package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto>  {
	
	public abstract double getValor();
}
