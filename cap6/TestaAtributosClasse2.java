class TestaAtributosClasse2 {
	public static void main(String[] args) {
		Cliente carlos = new Cliente("111111");
		
		carlos.setNome("Carlos");
		System.out.println("\nCliente " + carlos.getNome());
		System.out.println("\nCPF: " + carlos.getCPF());
		
		int total = Conta.getTotalDeContas();

		System.out.println("\n***Total de contas criadas " + total);

		Conta c1 = new Conta(carlos);

		System.out.println("\n***Total de contas criadas " + Conta.getTotalDeContas());

	}
}