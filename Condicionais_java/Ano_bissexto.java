void main(){

    int ano = Integer.parseInt(IO.readln("Digite o ano: "));

    if(ano % 4 == 0)
        IO.println(ano + " é um ano bissexto! ");
    else
        IO.println(ano + "Não é um ano bissexto! ");

}