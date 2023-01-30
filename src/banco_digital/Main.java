package banco_digital;

public class Main {
	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		Conta cc = new ContaCorrente(lucas);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(lucas);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
