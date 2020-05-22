package aula20200522.turmas;

public class AppTurmas {
	
	public static void main(String[] args) {
		
		imprimirValorNoConsole(2);
		imprimirValorNoConsole(1+1);
		
		Turma adsis3s2020 = new Turma("ADSIS3S-N-A");
		
		Aluno leonardo = new Aluno("Leonardo", "11154-4");
		Aluno hector = new Aluno("Hector","22211-4");
		//Aluno arthur = new Aluno("Arthur","66654-7");
		
		adsis3s2020.adicionarAluno(leonardo);
		adsis3s2020.adicionarAluno(hector);
		//adsis3s2020.adicionarAluno(arthur);
		adsis3s2020.adicionarAluno(new Aluno("Arthur","66654-7"));
		
		adsis3s2020.setLíder(leonardo);
		
		listarTurmaNoConsole(adsis3s2020);
	}
	
	private static void imprimirValorNoConsole(int valor) {
		System.out.println("************");
		System.out.println("Valor = " + valor);
		System.out.println("************");		
	}

	private static void listarTurmaNoConsole(Turma t) {
		System.out.println("----------------------------------------");
		System.out.println("Turma: " + t.getCódigo());
		System.out.println("Líder: " + t.getLíder().getNome());
		System.out.println("----------------------------------------");
		System.out.println("Alunos: ");
		for (Aluno a : t.getAlunos()) {
			System.out.println(a.getRa() + "  " + a.getNome());
		}
	}

}
