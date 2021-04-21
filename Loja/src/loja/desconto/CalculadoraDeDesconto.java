package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Pedido pedido) {
		
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(
				new DescontoPorItem(
				new SemDesconto(null)));
		
		return cadeiaDeDesconto.calcular(pedido);
	}
}
