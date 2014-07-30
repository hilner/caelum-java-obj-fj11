class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[3];
		
		Funcionario f1 = new Funcionario();
		f1.nome = "José";
		f1.departamento = "Fisica";
		f1.salario = 100;
		f1.dataEntrada.dia = 21;
		f1.dataEntrada.mes = 1;
		f1.dataEntrada.ano = 2014; 
		f1.rg = "1111111";
		f1.estaNaEmpresa = true;

		empresa.adiciona(f1);

		Funcionario f2 = new Funcionario();
		f2.nome = "Einstein";
		f2.departamento = "Fisica";
		f2.salario = 100;
		f2.dataEntrada.dia = 1;
		f2.dataEntrada.mes = 1;
		f2.dataEntrada.ano = 2014; 
		f2.rg = "2222222";
		f2.estaNaEmpresa = true;

		empresa.adiciona(f2);

		Funcionario f3 = new Funcionario();
		f3.nome = "Antonio";
		f3.departamento = "Fisica";
		f3.salario = 100;
		f3.dataEntrada.dia = 21;
		f3.dataEntrada.mes = 1;
		f3.dataEntrada.ano = 2014; 
		f3.rg = "1111111";
		f3.estaNaEmpresa = false;

		empresa.adiciona(f3);

		// verificando se é possivel inserir
		Funcionario f4 = new Funcionario();
		f4.nome = "Mari";
		f4.departamento = "Fisica";
		f4.salario = 100;
		f4.dataEntrada.dia = 15;
		f4.dataEntrada.mes = 1;
		f4.dataEntrada.ano = 2014; 
		f4.rg = "4444444";
		f4.estaNaEmpresa = false;

		empresa.adiciona(f4);

		empresa.mostraEmpregados();

		empresa.mostraSalariosEmpregados();
	}
}