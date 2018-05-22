
public class Main {
	public static void main(String[] args) {
		Poupanca nova = new Poupanca(112, 200.00, "Robson");
		Poupanca pop = new Poupanca(109, 0, "zé");
		Corrente cot = new Corrente(1, 100, "titular");
		System.out.println(nova.getSaldo());
		System.out.println(pop.getSaldo());
		nova.transferir(pop, 100);
		nova.depositar(pop,300);
		pop.sacar(200);
		System.out.println(pop.getTitular());
		System.out.println(nova.getSaldo());
		cot.transferir(nova, 100);
		cot.transferir(nova, 300);
		cot.transferir(nova, 700);
		cot.transferir(nova, 100);
		System.out.println(nova.getSaldo());
		cot.exibirSaldo();
	}
}
