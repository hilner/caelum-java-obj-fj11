class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Hugo";
		f1.salario = 10000;
		f1.recebeAumento(50);

		// brincadeiras com f1...
		f1.mostra();
	}
	
}