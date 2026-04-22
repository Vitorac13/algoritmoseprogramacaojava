void main(){

    float nota1 = Float.parseFloat(IO.readln("Digite a primeira nota: "));
    float nota2 = Float.parseFloat(IO.readln("Digite a segunda nota: "));
    float nota3 = Float.parseFloat(IO.readln("Digite a terceira nota: "));

    float media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("A média das notas é: %.2f \n", media);

}