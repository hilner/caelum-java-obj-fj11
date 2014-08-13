import java.util.Calendar;

class Data {
	int dia;
	int mes;
	int ano;

	public void validaData() {
		if (mes == 2) {
			if (dia > 28) {
				if (dia > getMaxDiaFev(ano)) {
					System.out.println("Data Inválida!");
				} else {
					System.out.println("Data ok!");
				}
			}
		}
	}

	public String formatada (String separador) {
		return dia + separador + mes + separador + ano;
	}

	private static int getMaxDiaFev(int ano) {
		Calendar cal = (Calendar) Calendar.getInstance().clone();
		
		cal.set(Calendar.YEAR, ano);  
        cal.set(Calendar.MONTH, 1); // Fevereiro  

        return cal.getActualMaximum(Calendar.DAY_OF_MONTH); 		
	}
}