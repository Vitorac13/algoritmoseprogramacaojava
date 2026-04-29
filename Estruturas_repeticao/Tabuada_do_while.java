void main(){

    int multiplicador = 1;

    int num = Integer.parseInt(IO.readln("Informe um número: "));

    do{
        System.out.printf("%d x %d = %d \n", num, multiplicador, num*multiplicador);
        multiplicador++;
    } while(multiplicador <= 10);
}