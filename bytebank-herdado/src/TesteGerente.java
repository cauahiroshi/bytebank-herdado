
public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerenteUm = new Gerente(); 
		gerenteUm.setNome("Marco");
		gerenteUm.setCpf("235568413");
		gerenteUm.setSalario(5000.0);
		
		System.out.println(gerenteUm.getNome());
		System.out.println(gerenteUm.getCpf());
		System.out.println(gerenteUm.getSalario());
		
		gerenteUm.setSenha(2222);
		boolean autenticou = gerenteUm.autentica(2222); 
		
		System.out.println(autenticou);
	}

}
