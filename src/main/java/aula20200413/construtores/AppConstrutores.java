package aula20200413.construtores;

public class AppConstrutores {

	public static void main(String[] args) {
		Aluno maria = new Aluno("1112-4", "Maria", "das Graças", "ADS", 2019);

		Aluno josias = new Aluno();

		josias.setRa("22214-3");
		josias.setCurso("Análise e Desenvolvimento de Sistemas");
		//josias.setAnoDeIngresso(2019);
		josias.setPrimeiroNome("Josias");
		josias.setSobrenome("Albuquerque Alcântara");
		

		System.out.println(maria.toString());		
		System.out.println(josias.toString());
		System.out.println("Foi.");
	}

}
