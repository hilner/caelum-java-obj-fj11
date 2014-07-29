class Empresa {
	Funcionario[] empregados;
	String cnpj;
	int tam;

	// constructor
	public Empresa () {
		tam = 0;
		empregados = new Funcionario[10];
	}

	void adiciona(Funcionario f) {
		this.empregados[tam] = f;
		this.empregados[tam].mostra();
		tam++;
	}
}