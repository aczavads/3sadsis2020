package aula20200529.localidadesAssocBidirecional;

public class Estado {
	private String nome;
	private País país;
	
	public Estado(String nome, País país) {
		this.nome = nome;
		this.país = país;
		//Vamos adicionar este estado (this) ao País ao qual ele pertence!
		this.país.addEstado(this);
	}
	
	public void setPaís(País país) {
		this.país = país;
	}
	
	public País getPaís() {
		return país;
	}
	
	public String getNome() {
		return nome;
	}
	
}
