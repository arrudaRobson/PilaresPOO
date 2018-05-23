
public class Cliente extends Pessoa {
	private String profissao;
	
	public Cliente(String nome, String cpf, String profissao) {
		super(nome, cpf);
		this.profissao = profissao;	
	}
}
