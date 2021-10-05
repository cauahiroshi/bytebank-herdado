
public class Gerente extends Funcionario implements Autenticavel {

	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
	}

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

}
