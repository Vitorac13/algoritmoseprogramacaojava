void definirNumeros(){
    num[0] = 6;
    num[1] = 7;
    num[2] = 8;

    if (num[0] > num[1] && num[0] > num[2]) {
        IO.println("O maior número é: " + num[0]);
    } else if (num[1] > num[2]) {
        IO.println("O maior número é: " + num[1]);
    } else {
        IO.println("O maior número é: " + num[2]);
    }

    IO.println(num[0]);
    IO.println(num[1]);
    IO.println(num[2]);
}

float[] num = new float[3];

void main(){

    definirNumeros();    

}