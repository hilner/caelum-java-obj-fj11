class TestaConstructor1 {
	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");

		Conta c = new Conta(carlos);
		System.out.println(c.getTitular().getNome());
	}
}