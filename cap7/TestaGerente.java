class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		// podemos chamar métodos do Funcionario
		gerente.setNome("João da Silva");

		// e também métodos do Gerente!
		gerente.setSenha(4321);
		gerente.autentica(4321);

		gerente.setSalario(5000.0);
		gerente.getBonificacao();
		System.out.println(gerente.getBonificacao());
	}
}