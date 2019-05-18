package br.com.casadocodigo.livraria.teste;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("CUP11");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Este cupom não existe");
		}
	}

}
