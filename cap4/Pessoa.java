class Pessoa {
	String nome;
	int idade;

	void fazAniversario() {
		this.idade++;
		System.out.println("Parabens " + this.nome + " pelos seus " + this.idade + " anos de idade!");
	}
}