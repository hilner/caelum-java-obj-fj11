class TestaFuncionarioData {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Emiliano";
		f1.salario = 100;
		Data data = new Data();
		f1.dataEntrada = data;

		f1.mostra();

	}
}