package aula20200629.dúvidasFinais;

public interface CoisaQuePousa {
	
	default void pousar() {
		System.out.println("Pouso padrão;");
	}

}
