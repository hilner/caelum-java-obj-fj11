class TestaFuncionario2 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;

		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;

		System.out.println("Novos objetos");

		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		System.out.println("Referencia ao mesmo funcionário");
		f2 = f1;

		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
	
}