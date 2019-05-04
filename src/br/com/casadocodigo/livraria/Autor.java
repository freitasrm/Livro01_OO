package br.com.casadocodigo.livraria;

public class Autor {

	private String nome;
	private String email;
	private String cpf;
	
	@Override
	public String toString() {
		return 	"Mostrando detalhes do autor "+
				"\nNome: " + nome +
				"\nEmail: " + email+
				"\nCPF: " + cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
				
	}
	
}
