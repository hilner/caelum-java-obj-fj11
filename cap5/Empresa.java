class Empresa {
	Funcionario[] empregados;
	String cnpj;
	int tam;

	// constructor
	public Empresa() {
		tam = 0;
		//empregados = new Funcionario[10];
	}

	void adiciona(Funcionario f) {
		if (tam < empregados.length) {
			System.out.println("\nArray lenght = " + empregados.length);
			System.out.println("\nElemento = " + tam);
			empregados[tam] = f;
			empregados[tam].mostra();
			tam++;
		} else {
			System.out.println("\nVagas preenchidas!");
		}
	}

	void mostraEmpregados() {
		System.out.println();
		for (Funcionario i : empregados) { // enhanced-for
			System.out.println("Funcionário na posição: " + i);
			i.mostra();

		}
	}
}