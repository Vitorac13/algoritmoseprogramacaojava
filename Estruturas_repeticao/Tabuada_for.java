void main(){

    int num = Integer.parseInt(IO.readln("Informe um número: "));

    for(int multiplicador=1; multiplicador<=10; multiplicador++){
        System.out.printf("%d x %d = %d \n", num, multiplicador, num*multiplicador);
    }

}