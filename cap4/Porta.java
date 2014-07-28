class Porta {
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;

	void abre (){
		aberta = true;
		System.out.println("Porta aberta!");
	}

	void fecha () {
		aberta = false;
		System.out.println("Porta fechada");
	}

	void pinta (String s) {
		cor = s;
		System.out.println("pintando de " + cor);
	}

	boolean estaAberta () {
		return aberta;
	}

}
	
