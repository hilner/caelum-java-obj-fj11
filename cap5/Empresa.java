class Empresa {
	Funcionario[] empregados;
	String cnpj;
	int tam;

	// constructor
	public Empresa () {
		tam = 0;
		//empregados = new Funcionario[10];
	}

	void adiciona(Funcionario f) {
		if (tam < empregados.length) {
			System.out.println("\nArray lenght = " + empregados.length);
			System.out.println("\nElemento = " + tam);
			this.empregados[tam] = f;
			this.empregados[tam].mostra();
			tam++;
		} else {
			System.out.println("\nVagas preenchidas!");
		}
	}
}