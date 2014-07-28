class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta(); 
	Porta porta3 = new Porta();

	void pinta (String a) {
		cor = a;
		System.out.println("Casa pintada de " + cor);
	}

	int quantasPortasEstaoAbertas () {

		int abertas = 0;

		if (porta1.estaAberta()) {
			abertas++;
		}

		if (porta2.estaAberta()) {
			abertas++;
		}

		if (porta3.estaAberta()) {
			abertas++;
		}

		return abertas;

	}
}