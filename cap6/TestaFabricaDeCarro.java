class TestaFabricaDeCarro {
	public static void main(String[] args) {
		FabricaDeCarro fc1 = FabricaDeCarro.getInstancia();
		System.out.println("Instancia fc1 criada!");

		FabricaDeCarro fc2 = FabricaDeCarro.getInstancia();
		System.out.println("Instancia fc2 criada!");

		if (fc1 == fc2) {
			System.out.println("iguais");
		} else {
			System.out.println("Diferentes");
		}

	}
}