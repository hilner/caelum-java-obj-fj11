class Repeticoes {

  public static void main(String[] args) {
 
    // while
    int idade = 15;
    while (idade < 18) {
      System.out.println(idade);
      idade = idade + 1; // ou idade++
    }

    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    
    }

    for (int i2 = 0; i2 < 10; i2 = i2 + 1) {
      System.out.println("Hello World!");
    }

    // pos incremento ++
    int i2 = 5;
    System.out.println("Valor de i2 = 5 -> "+ i2);


    int x = i2++; // x ainda valera 5

    System.out.println("Valor de i2++ -> "+ i2);
    System.out.println("Valor de x = i2++ -> "+ x); 

    System.out.println();
    // pre incremento ++
    int i3 = 5;    
    System.out.println("Valor de i3 = 5 -> "+ i3); 

    int x2 = ++i3; // x2 agora sera 6

    System.out.println("Valor de ++i3 -> "+ i3);
    System.out.println("Valor de x2 = ++i3 -> "+ x2); 


    // controlando loops
    for (int i4 = 3; i4 < 100; i4++) {
      if (i4 % 19 == 0) {
        System.out.println("Achado num. divisivel por 19: " + i4);
        break;
      }
    }

  }

}
