void main(){

    while (true){

        IO.println("\nMenu:");
        IO.println("1 - Somar os números digitados.");
        IO.println("2 - Subtrair os números digitados.");
        IO.println("0 - Sair. \n");
        int opcao = Integer.parseInt(IO.readln("Selecione uma opção: "));
        
        if (opcao == 0) {IO.println("\nPrograma encerrado"); System.exit(0);}

        int num1 = Integer.parseInt(IO.readln("\nDigite o primeiro número: "));
        int num2 = Integer.parseInt(IO.readln("Digite o segundo número: "));

        switch(opcao){
            case 1:
                IO.println("\nResultado da soma: " + (num1 + num2));
                break;
            case 2:
                IO.println("\nResultado da subtração: " + (num1 - num2));
                break;
            default:
                IO.println("\nOperação inválida.");
        }
    }

}