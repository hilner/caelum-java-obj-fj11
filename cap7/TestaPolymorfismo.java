class TestaPolymorfismo {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000.0);
		System.out.println("Bonificação: " + funcionario.getBonificacao());
	}
}