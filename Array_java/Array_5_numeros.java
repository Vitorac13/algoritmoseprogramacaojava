void main(){

    int quant = 5;

    var num = new int[quant];

    for(int i=0; i<quant; i++)
        num[i] = Integer.parseInt(IO.readln("Digite o " + (i+1) + "º número: "));

    IO.println("Estes foram os números digitados: ");

    for(int i=0; i<quant; i++)
        IO.println("Posição " + (i+1) + " número: " + num[i]);

}