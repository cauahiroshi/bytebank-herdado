
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();

		Gerente gerenteUm = new Gerente(); 
		gerenteUm.setNome("Marco");
		gerenteUm.setCpf("235568413");
		gerenteUm.setSalario(5000.0);
		
		System.out.println(gerenteUm.getNome()); //nome
		System.out.println(gerenteUm.getCpf());  //cpf
		System.out.println(gerenteUm.getSalario());  //salario
		
		gerenteUm.setSenha(2222);
		boolean autenticou = gerenteUm.autentica(2222); 
		
		System.out.println(autenticou); // true
		
		System.out.println(gerenteUm.getBonificacao()); //bonificacao
	}

}
