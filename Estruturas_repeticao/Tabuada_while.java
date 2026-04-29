void main(){

    int multiplicador = 1;

    int num = Integer.parseInt(IO.readln("Informe um número: "));

    while(multiplicador <= 10){
        System.out.printf("%d x %d = %d \n", num, multiplicador, num*multiplicador);
        multiplicador++;
    }
}