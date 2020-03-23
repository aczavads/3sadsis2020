package aula20200323.cofre;

public class Cofre {
	private boolean aberto = false;
	
	public void abrir() {
		aberto = true;
	}
	public void fechar() {
		aberto = false;
	}
	public boolean isAberto() {
		//return false;
		return aberto;
	}

}
