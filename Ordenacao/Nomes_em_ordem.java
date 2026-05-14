void main(){

    var nome = new String[5];
    String aux;

    for(int i=0; i<nome.length; i++)
        nome[i] = IO.readln("Escreva o nome[" + i + "]: ");

    IO.println("Esses foram os nomes digitados: ");
    for(int i=0; i<nome.length; i++)
        IO.println("nome[" + i + "] = " + nome[i]);

    for(int i=0; i<nome.length-1; i++)
        for(int j=i+1; j<nome.length; j++)
            if(nome[i].compareToIgnoreCase(nome[j]) > 0){
                aux = nome[i];
                nome[i] = nome[j];
                nome[j] = aux;
            }

    IO.println("Estes são os nomes em ordem alfabética: ");
    for(int i=0; i<nome.length; i++)
        System.out.printf("nome[%d] = %s \n", i, nome[i]);

}