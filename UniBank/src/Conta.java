
public abstract class Conta {
	private int numero;
	private double saldo;
	private String titular;
	
	public int getNumero(){
		return this.numero;
	}
	
	public int setNumero(int num) {
		return this.numero = num;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
		
}
