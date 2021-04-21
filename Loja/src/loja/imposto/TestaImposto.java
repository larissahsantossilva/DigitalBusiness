package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public class TestaImposto {

	public static void main(String[] args) {
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(new ISS());
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		
		//trocar de estrategia 
		calculadoraDeImposto.setImposto(new ICMS());
		imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
	}

}
