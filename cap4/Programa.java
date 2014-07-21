class Programa {

	public static void main (String[] args) {
		// criando a conta
		Conta1 minhaConta;
		minhaConta = new Conta1();

		// alterando os valores de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;


		// saca 200 reais
		if (minhaConta.saca(200)) {
			System.out.println("minhaConta - Retirada: " + 200 + " reais");
			System.out.println("minhaConta - Saldo atualizado: " + minhaConta.saldo);
		} else {
			System.out.println("minhaConta - Não consegui sacar");
		}

		// deposita 500 reais
		minhaConta.deposita(500);

		System.out.println("minhaConta - Deposito: " + 500 + " reais");
		System.out.println("minhaConta - Saldo atualizado: " + minhaConta.saldo);

		Conta1 meuSonho;
		meuSonho = new Conta1();
		meuSonho.dono = "Eumesmo";
		meuSonho.saldo = 15000000;

		System.out.println("meuSonho - Saldo inicial: " + minhaConta.saldo);

	}
}
