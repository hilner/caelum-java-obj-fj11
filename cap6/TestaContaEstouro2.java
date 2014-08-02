class TestaContaEstouro2 {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.limite = 100;
		minhaConta.saldo = -200; // saldo esta abaixo dos 100 de limite		
		System.out.println("Saldo da conta " + minhaConta.saldo);
	}
}