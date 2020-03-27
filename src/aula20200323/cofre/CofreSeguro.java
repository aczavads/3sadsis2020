package aula20200323.cofre;

public class CofreSeguro {
	private boolean aberto = false;
	private int senha;
	
	public CofreSeguro(int novaSenha) {
		this.senha = novaSenha;
	}
	
	public void abrir(int senhaInformada) {
		if (senhaInformada == this.senha) {
			aberto = true;
		}
	}
	public void fechar() {
		aberto = false;
	}
	public boolean isAberto() {
		//return false;
		return aberto;
	}


}
