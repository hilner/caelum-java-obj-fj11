class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;

	void recebeAumento(double aumento) {};

	double calculaGanhoAnual () {
		return this.salario * 12;
	};

	void mostra() {
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		System.out.println(this.dataEntrada);
		System.out.println(this.rg);
	}
}

