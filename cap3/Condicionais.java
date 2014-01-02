class Condicionais {

  public static void main(String[] args){
 
    // if e else
    int idade = 15;
    boolean amigoDoDono = true;

    // deixando o codigo mais legivel
    // utilizando o operador de negacao, o !

    if (idade < 18 && !amigoDoDono) {
      System.out.println("Nao pode entrar!");
    
    } else {
      System.out.println("Pode entrar!");
    
    }

  }

}
