
public class Poupanca extends Conta implements CaixaEletronico {

	public Poupanca(int numero, double saldo, Cliente titular) {
		super(numero, saldo, titular);
	}

	public void transferir(Conta conta, double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			conta.setSaldo(conta.getSaldo()+ valor);
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	@Override
	public void exibirSaldo() {
		
		
	}


	@Override
	public void depositar(Conta conta, double valor) {
		
		
	}

	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		
	}
}
