package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto, Promocional{

	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.01) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}

	@Override
	public int compareTo(Produto outro) {
		return Integer.compare((int)this.getValor(),(int)outro.getValor());
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	
}
