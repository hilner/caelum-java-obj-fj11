class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa(3);
		//empresa.empregados = new Funcionario[3];
		
		Funcionario f1 = new Funcionario();
		System.out.println("ID " + f1.getID());
		f1.setNome("José");
		f1.setDepartamento("Fisica");
		f1.setSalario(100);
		f1.setRG("1111111");
		f1.setEstaNaEmpresa(true);

		empresa.setFuncionario(f1);

		Funcionario f2 = new Funcionario();
		System.out.println("ID " + f1.getID());
		f2.setNome("Einstein");
		f2.setDepartamento("Fisica");
		f2.setSalario(100);
		f2.setRG("2222222");
		f2.setEstaNaEmpresa(true);

		empresa.setFuncionario(f2);

		Funcionario f3 = new Funcionario();
		System.out.println("ID " + f1.getID());
		f3.setNome("Antonio");
		f3.setDepartamento("Fisica");
		f3.setSalario(100);
		f3.setRG("1111111");
		f3.setEstaNaEmpresa(false);

		empresa.setFuncionario(f3);

		// verificando se é possivel inserir
		Funcionario f4 = new Funcionario();
		System.out.println("ID " + f1.getID());
		f4.setNome("Mari");
		f4.setDepartamento("Fisica");
		f4.setSalario(100);
		f4.setRG("4444444");
		f4.setEstaNaEmpresa(false);

		empresa.setFuncionario(f4);

		empresa.mostraEmpregados();

		empresa.mostraSalariosEmpregados();
	}
}