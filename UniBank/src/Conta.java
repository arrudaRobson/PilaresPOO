
public abstract class Conta implements CaixaEletronico {
	private int numero;
	private double saldo;
	private Cliente titular;
	public static int total;
	
	public Conta(int numero, double saldo, Cliente titular) {
		Conta.total++;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	public int getNumero(){
		return this.numero;
	}
		
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
			
}
