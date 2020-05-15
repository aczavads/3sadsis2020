package aula20200515.pedido;

public class ItemPedido {
	//- quantidade : double
	private double quantidade;
	
	//- preço : double
	private double preço;
	
	//- produto (atributo de associação) 
	private Produto produto;
	

	//+ getValorTotal() : double
	public double getValorTotal() {
		return quantidade * preço;
	}
	
	//+ getQuantidade() : double
	public double getQuantidade() {
		return quantidade;
	}
	
	//+ getPreço() : double
	public double getPreço() {
		return preço;
	}
	
	//+ getProduto() : Produto
	public Produto getProduto() {
		return produto;
	}
	
	//+ ItemPedido(produto : Produto, quantidade : double, preco : double)
	public ItemPedido(Produto produto, double quantidade, double preço) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preço = preço;
	}
}
