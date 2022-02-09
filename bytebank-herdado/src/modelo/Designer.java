package modelo;
public class Designer extends Funcionario {

	
	@Override
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do DESIGNER");
		return 200;
	}

	
	
}
