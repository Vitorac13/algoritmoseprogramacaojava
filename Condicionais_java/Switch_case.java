void main(){

    int num1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
    int num2 = Integer.parseInt(IO.readln("Digite o segundo número: "));

    IO.println("\nMenu:");
    IO.println("1 - Somar os números digitados.");
    IO.println("2 - Subtrair os números digitados. \n");
    int opcao = Integer.parseInt(IO.readln("Selecione uma opção: "));

    switch(opcao){
        case 1:
            IO.println("\mResultado da soma: " + (num1 + num2));
            break;
        case 2:
            IO.println("\nResultado da subtração: " + (num1 - num2));
            break;
        default:
            IO.println("\nOperação inválida.");
    }

}