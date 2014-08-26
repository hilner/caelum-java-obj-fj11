class TestaAtualizadorDeContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		System.out.println("Conta");
		c.deposita(1000);
		System.out.println("Conta Corrente");
		cc.deposita(1000);
		System.out.println("Conta Poupança");
		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}