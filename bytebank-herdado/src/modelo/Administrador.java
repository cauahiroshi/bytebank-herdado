package modelo; 
public class Administrador extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		return 50;
	}

	private AutenticacaoUtil autenticador;

	public Administrador() {
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
