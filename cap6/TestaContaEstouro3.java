class TestaContaEstouro3 {
	public static void main(String[] args) {
		// a conta
		Conta minhaConta = new Conta();

		minhaConta.limite = 100;
		minhaConta.saldo = 100;

		// quero mudar o saldo para -200
		double novoSaldo = -200;

		// testa se o novoSaldo ultrapassa o limite da conta
		if (novoSaldo < minhaConta.limite) {
			System.out.println("Não posso mudar para esse saldo!");
		} else {
			minhaConta.saldo = novoSaldo;
		}
	}
}