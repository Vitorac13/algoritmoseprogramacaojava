float fat(int numero){
    int fatorial = 1;
    for(int i=1; i<=numero; i++)
        fatorial = fatorial * i;
    return fatorial;
}

void main(){

    int numero = Integer.parseInt(IO.readln("Digite um numero: "));
    System.out.println("O fatorial de " + numero + " é: " + fat(numero));

}