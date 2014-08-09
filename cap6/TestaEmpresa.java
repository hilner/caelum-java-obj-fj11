class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[3];
		
		Funcionario f1 = new Funcionario();
		f1.setNome("José");
		f1.setDepartamento("Fisica");
		f1.setSalario(100);
		f1.setRG("1111111");
		f1.setEstaNaEmpresa(true);

		empresa.adiciona(f1);

		Funcionario f2 = new Funcionario();
		f2.setNome("Einstein");
		f2.setDepartamento("Fisica");
		f2.setSalario(100);
		f2.setRG("2222222");
		f2.setEstaNaEmpresa(true);

		empresa.adiciona(f2);

		Funcionario f3 = new Funcionario();
		f3.setNome("Antonio");
		f3.setDepartamento("Fisica");
		f3.setSalario(100);
		f3.setRG("1111111");
		f3.setEstaNaEmpresa(false);

		empresa.adiciona(f3);

		// verificando se é possivel inserir
		Funcionario f4 = new Funcionario();
		f4.setNome("Mari");
		f4.setDepartamento("Fisica");
		f4.setSalario(100);
		f4.setRG("4444444");
		f4.setEstaNaEmpresa(false);

		empresa.adiciona(f4);

		empresa.mostraEmpregados();

		empresa.mostraSalariosEmpregados();
	}
}