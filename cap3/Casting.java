class Casting {

  public static void main(String[] args){
  
    double d = 3.1415;
    double i = d;

    // tambem nao compila pois fica dificil para o compilador
    // determinar se o valor estara dentro desse double em tempo de execucao
    double a = 5;
    double b = a;

    // mas assim compila
    int c = 5;
    double d2 = c;

    // forcando um float / double caber num int - Casting
    double d3 = 3.14;
    int i3 = (int) d3;
 
    System.out.println("Casting de d3 em i3 foi: "+ i3);

    // agora esta compilando

    long x = 10000;
    int i4 = (int) x;
    
  }

}
