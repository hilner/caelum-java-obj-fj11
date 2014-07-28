class Programa3 {
	public static void main(String[] args) {
		Casa c = new Casa();

		c.pinta("branca");

		c.porta1.abre();
		c.porta2.abre();
		c.porta3.abre();

		System.out.println("Há " + c.quantasPortasEstaoAbertas() + " portas abertas!");
	}
}