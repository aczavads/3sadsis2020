package aula20200518.pedido;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
}
