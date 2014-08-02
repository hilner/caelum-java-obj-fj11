class TestaContaEstouro1 {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();

		minhaConta.saldo = 1000.0;
		System.out.println("Saldo atual: " + minhaConta.saldo);

		minhaConta.limite = 1000.0;

		minhaConta.saca(50000);  // saldo + limite é só 2000!!


		System.out.println("Saldo atual: " + minhaConta.saldo);
	}
}