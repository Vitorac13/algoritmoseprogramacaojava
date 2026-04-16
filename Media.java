void main(){

    float nota1 = Float.parseFloat(IO.readln("Digite a 1a nota: "));
    float nota2 = Float.parseFloat(IO.readln("Digite a 2a nota: "));
    float nota3 = Float.parseFloat(IO.readln("Digite a 3a nota: "));

    float media_calculada = (nota1 + nota2 + nota3)/3;

    IO.println("A média das notas é: " + media_calculada);

}