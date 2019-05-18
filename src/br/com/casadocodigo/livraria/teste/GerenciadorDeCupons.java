package br.com.casadocodigo.livraria.teste;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("CUP11",10.0);
		cupons.put("CUP22",12.0);
		cupons.put("CUP33",13.0);
		cupons.put("CUP44",14.0);
	}
	
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}
