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
    System.out.println("Valor de i -> " + i);
    System.out.println("Valor de j = i -> " + j);

    i = i + 1; // i vira 6 e j continua: 5

    System.out.print("i = i + 1 ->");
    System.out.println(i);
    System.out.println("O valor de j nao foi alterado ->"+ j);

    // outros tipos
    byte b = 127;
    short s = 32767;
    int n = 2147483647;
    long l = 1000000;
    float f = 100000000;
    double d = 1.7E+38;

    System.out.println("Outros tipos primitivos");
    System.out.println("Byte (inteiro: -128 a 127) b -> "+ b);
    System.out.println("Short (inteiro: -32768 a 32767) s -> "+ s);
    System.out.println("Int (inteiro: -2147483648 a 2147483647) n -> "+ n);
    System.out.println("Long (inteiro: -9223372036854775808 a 9223372036854775807) l -> "+ l);
    System.out.println("Float (inteiro:  +/-3.4E-38 a +/-3.4E+38) f -> "+ f);
    System.out.println("Double (inteiro:  +/-1.7E-38 a +/-1.7E+38) d -> "+ d);

  }

}
