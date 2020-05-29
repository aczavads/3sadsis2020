package aula20200529.localidadesAssocBidirecional;

public class AppLocalidades {
	
	public static void main(String[] args) {
		País brasil = new País("República Federativa do Brasil");
		
		Estado pr = new Estado("Paraná", brasil);
		Estado ac = new Estado("Acre", brasil);
		
		brasil.removeEstado(ac);
		
		System.out.println("País do Acre: " + ac.getPaís().getNome());
		System.out.println("País do Paraná: " + pr.getPaís().getNome());
		
		System.out.println();
		System.out.println("Estados do Brasil:");
		for (Estado e : brasil.getEstados()) {
			System.out.println(e.getNome());
		}
		
	}
	
}
