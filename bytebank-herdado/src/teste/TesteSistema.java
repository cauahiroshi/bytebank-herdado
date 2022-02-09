package teste;

public class TesteSistema {

	public static void main(String[] args) {
		
		modelo.Gerente g = new modelo.Gerente();
		g.setSenha(2222);
		
		modelo.Administrador adm = new modelo.Administrador();
		adm.setSenha(2222);
		
		modelo.Cliente cliente = new modelo.Cliente();
		cliente.setSenha(2222);
		
		modelo.SistemaInterno sI = new modelo.SistemaInterno();
		sI.autentica(g);
		sI.autentica(adm);
		sI.autentica(cliente);
	}
}
