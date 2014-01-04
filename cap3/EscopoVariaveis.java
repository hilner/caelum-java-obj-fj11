class EscopoVariaveis {

  public static void main(String[] args){
  
    // aqui a variavel i nao existe
    int i = 5;
    // a partir daqui ela existe

    while (i == 5) {
      // o i ainda vale aqui
      int j = 7;
      // o j passa a existir
      i++;
    }
    // aqui o j nao existe mais, mas o i continua dentro do escopo

  }

}
