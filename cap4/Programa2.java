class Programa2 {
	public static void main(String[] args) {
		Porta p = new Porta();
		p.abre();
		p.fecha();
		p.pinta("azul");
		p.pinta("verde");
		p.pinta("amarelo");
		p.dimensaoX = 3;
		p.dimensaoY = 2;
		p.dimensaoZ = 1;
		if (p.estaAberta()) {
			System.out.println("A porta ficou aberta!");
		} else {
			System.out.println("A porta esta fechada!");
		}

	}
}