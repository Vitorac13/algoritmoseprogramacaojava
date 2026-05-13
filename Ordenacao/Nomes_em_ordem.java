void main(){

    var nome = new String[5];

    for(int i=0; i<nome.length; i++)
        nome[i] = IO.readln("Escreva o nome[" + i + "]: ");

    IO.println("Esses foram os nomes digitados: ");
    for(int i=0; i<nome.length; i++)
        IO.println("nome[" + i + "] = ");

    for(int i=0; i<nome.length-1; i++)
        for(int j=0; j<nome.length-1; j++)
            if(nome[i].compareToIgnoreCase(nome[j])){

            }


}