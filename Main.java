
public class Main {

	public static void main(String[] args) {
		Cliente Larissa = new Cliente();
		Larissa.setNome("Larissa");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(1000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
