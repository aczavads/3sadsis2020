package aula20200525.localidades;

public class AppLocalidades {
	
	public static void main(String[] args) {
		País br = new País("Brasil", 55);
		
		Estado pr = new Estado("Paraná", "PR", 44);
		Estado sp = new Estado("São Paulo", "SP", 11);
		
		br.addEstado(pr);
		br.addEstado(sp);
		br.addEstado(pr);
		br.addEstado(sp);
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		br.addEstado(new Estado("Paraná", "PR", 44));
		
		
		listarPaísNoConsole(br);
	}
	
	private static void listarPaísNoConsole(País p) {
		System.out.println("---------------");
		System.out.println("País: " + p.getNome() + ", código DDI: " + p.getCódigoDDI());
		System.out.println("Quantidade de Estados: " + p.contaEstados());
		System.out.println("---------------");
		System.out.println("Estados:");
		for (Estado e : p.getEstados()) {
			System.out.println(e.getSigla() + "-" + e.getNome() + ": " + e.getCódigoDDD());
		}
	}

}
