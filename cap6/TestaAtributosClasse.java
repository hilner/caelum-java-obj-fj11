class TestaAtributosClasse {
	public static void main(String[] args) {
		Cliente carlos = new Cliente("111111");
		
		carlos.setNome("Carlos");
		System.out.println("\nCliente " + carlos.getNome());
		System.out.println("\nCPF: " + carlos.getCPF());
		
		Conta c1 = new Conta(carlos);

		int total = c1.getTotalDeContas();

		System.out.println("\n***Total de contas criadas " + total);

	}
}