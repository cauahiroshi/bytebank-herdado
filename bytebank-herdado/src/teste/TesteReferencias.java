package teste;

public class TesteReferencias {

	public static void main(String[] args) {

		modelo.Gerente g1 = new modelo.Gerente(); 
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		modelo.EditorVideo ev = new modelo.EditorVideo();
		ev.setNome("Claudemir");
		ev.setSalario(2500.0);
		
		modelo.Designer d = new modelo.Designer();
		d.setNome("Jonas");
		d.setSalario(2000.0);
		
		modelo.ControleBonificacao controle = new modelo.ControleBonificacao(); 
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());


	}

}
