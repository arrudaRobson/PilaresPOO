
public class Corrente extends Conta implements CaixaEletronico {
	private double credito = 1000.00;
	private double taxa = 0.45;
	
	public Corrente(int numero, double saldo, Cliente titular) {
		super(numero, saldo, titular);
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
		conta.setSaldo(getSaldo() + valor);
	}

	@Override
	public void sacar(int valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(getSaldo() - valor);
		} else if (this.credito >= valor){
			this.credito -= valor;
			this.setSaldo(getSaldo() - valor);
			System.out.println("Operação realizada com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
		
	}
	
	public void calcularJuros() {
		if (this.credito < 1000) {
			double cred = 1000 - this.credito;
			cred *= taxa;
			setSaldo(getSaldo() - cred);
		}
	}
}
