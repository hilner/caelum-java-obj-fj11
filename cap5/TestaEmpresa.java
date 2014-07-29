class TestaEmpresa {
	public static void main(String[] args) {
		Empresa emp = new Empresa();
		//emp.empregados = new Funcionario[10];
		Funcionario f1 = new Funcionario();
		f1.nome = "José";
		f1.departamento = "Fisica";
		f1.salario = 100;
		f1.dataEntrada.dia = 21;
		f1.dataEntrada.mes = 1;
		f1.dataEntrada.ano = 2014; 
		f1.rg = "1111111";
		f1.estaNaEmpresa = true;

		emp.adiciona(f1);

	}
}