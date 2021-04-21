package loja;

import java.math.BigDecimal;

public class Pedido {

	private BigDecimal valor;
	private int qtdItens;

	public int getQtdItens() {
		return qtdItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.qtdItens = 1;
	}
	
	public Pedido(BigDecimal valor, int qtdItens) {
		super();
		this.valor = valor;
		this.qtdItens = qtdItens;
	}
	
}
