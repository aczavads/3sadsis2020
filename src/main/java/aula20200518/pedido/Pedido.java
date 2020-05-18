package aula20200518.pedido;

import java.util.ArrayList;
import java.util.HashSet;

public class Pedido {
	//- número : int
	private int número;
	
	//- itens (atributo de associação)
	private HashSet<ItemPedido> itens = new HashSet<>();

	
	//+ getValorTotal() : double
	public double getValorTotal() {
		double valorTotal = 0.00;
		for (ItemPedido item : itens) {
			valorTotal += item.getValorTotal();
		}
		return valorTotal;
	}
	
	//+ getNúmero() : int
	public int getNúmero() {
		return número;
	}
	
	//+ Pedido(número : int)
	public Pedido(int número) {
		this.número = número;
	}
	
	//+ adicionarItem(itemPedido : ItemPedido) : void
	public void adicionarItem(ItemPedido itemPedido) {
		this.itens.add(itemPedido);
	}
	 
	//+ getItens() : ArrayList<ItemPedido>
	public HashSet<ItemPedido> getItens() {
		return itens;
	}

}
