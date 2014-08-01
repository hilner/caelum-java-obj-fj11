class TestaCasa {
	public static void main(String[] args) {
		Casa c1 = new Casa();
		c1.portas = new Porta[3];

		Porta p1 = new Porta();
		p1.porta = 1;
		p1.estaAberta = false;

		Porta p2 = new Porta();
		p2.porta = 2;
		p2.estaAberta = false;

		Porta p3 = new Porta();
		p3.porta = 3;
		p3.estaAberta = false;

		c1.adicionaPorta(p1);
		c1.adicionaPorta(p2);
		c1.adicionaPorta(p3);

		System.out.println(c1.quantasPortasEstaoAbertas() + " estão abertas!"); 

		c1.abrirPorta(p2);
		c1.abrirPorta(p3);

		System.out.println(c1.quantasPortasEstaoAbertas() + " estão abertas!"); 

		System.out.println("Total de portas da casa: " + c1.totalDePortas());
	}
}