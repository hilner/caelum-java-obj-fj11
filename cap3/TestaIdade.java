class TestaIdade {
  public static void main (String[] args){

    //declara a variavel idade
    int idade = 20;

    System.out.println(idade);

    int idadeNoAnoQueVem;
    idadeNoAnoQueVem = idade + 1;

    System.out.println(idadeNoAnoQueVem);
  
    // valores reais

    double pi = 3.14;
    double x = 5 * 10;

    System.out.println("Valores reais");
    System.out.println(pi);
    System.out.println(x);

    // booleano
    
    boolean menorDeIdade = idade < 18;
    System.out.println("variaveis booleanas");
    System.out.println(menorDeIdade);


    // tipo char - armazena apenas um caracter
    
    char letra = 'a';
    System.out.println("variaveis char");
    System.out.println(letra);


    // tipos primitivos e valores
    
    int i = 5; // i recebe uma copia do valor de 5
    int j = i; // j recebe uma copia do valor de i
    System.out.println("Tipos primitivos e valores");
    System.out.println("Valor de i " + i);
    System.out.println("Valor de j = i " + j);

    i = i + 1; // i vira 6 e j continua: 5

    System.out.println("i = i + 1");
    System.out.print(i);
    System.out.println("O valor de j nao foi alterado "+ j);


  }

}
