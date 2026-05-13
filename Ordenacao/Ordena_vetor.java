void main() {
    
    var num = new int[5];
    int aux;

    for(int i=0; i<num.length;i++)
        num[i] = Integer.parseInt(IO.readln("Digite o num[" + i + "]: "));
    
    IO.println("Esses foram os números digitados: ");
    for(int i=0; i<num.length; i++)
        IO.println("num[" + i + "] = " + num[i]);

    for(int i=0; i<num.length-1; i++){
        for(int j=i+1; j<num.length; j++){
            if(num[i] > num[j]){
                aux = num[i];
                num[i] = num[j];
                num[j] = aux;
            }
        }
    }
    IO.println("Estes foram os números digitados agora ordenados: ");

    for(int i=0; i<num.length; i++)
        System.out.println("num[" + i + "] = " + num[i]);

}