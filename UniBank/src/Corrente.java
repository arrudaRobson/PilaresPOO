
public class Corrente extends Conta implements CaixaEletronico {
	private double credito = 1000.00;
	public Corrente(int numero, double saldo, String titular) {
		setNumero(numero);
		setSaldo(saldo);
		setTitular(titular);
	}

	@Override
	public void exibirSaldo() {
		calcularJuros();
		System.out.println("Saldo da conta: " + getSaldo());
		System.out.println("Limite especial: " + this.credito);
	}

	@Override
	public void transferir(Conta conta, double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			conta.setSaldo(conta.getSaldo()+ valor);
			System.out.println("Operação realizada com sucesso!");
		} else if (this.credito >= valor) {
			this.credito -= valor;
			setSaldo(getSaldo() - valor);
			conta.setSaldo(conta.getSaldo()+ valor);
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
	}

	@Override
	public void depositar(Conta conta, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		
	}
	
	public void calcularJuros() {
		if (this.credito < 1000) {
			double cred = 1000 - this.credito;
			cred *= .45;
			setSaldo(getSaldo() - cred);
		}
	}
}
