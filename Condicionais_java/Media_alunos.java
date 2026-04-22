void main(){

    float nota1 = Float.parseFloat(IO.readln("Digite a primeira nota: "));
    float nota2 = Float.parseFloat(IO.readln("Digite a segunda nota: "));
    float nota3 = Float.parseFloat(IO.readln("Digite a terceira nota: "));

    float media = (nota1 + nota2 + nota3) / 3;

    if(media >= 7)
        System.out.printf("O aluno foi aprovado com média: %.2f \n", media);
    else
        System.out.printf("O aluno foi reprovado com média: %.2f \n", media);

}