package br.com.casadocodigo.livraria.teste;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		if(gerenciador.validaCupom("CUP1234")) {
			System.out.println("Cupom de desconto valido.");
		} else {
			System.out.println("Este cupom não existe");
		}
	}

}
