
public class Main {
	public static void main(String[] args) {
		Cliente robson = new Cliente("Robson", "00000-11", "progamador");
		
		Poupanca nova = new Poupanca(112, 200.00, robson);
	
		Corrente cot = new Corrente(1, 100, robson);
		System.out.println(nova.getSaldo());
	
		System.out.println(nova.getSaldo());
		
		
		System.out.println(nova.getSaldo());
		cot.exibirSaldo();
	}
}
