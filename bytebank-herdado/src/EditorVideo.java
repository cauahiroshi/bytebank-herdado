
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("editor de video");
		return super.getBonificacao() + 100;
	}
	
}
