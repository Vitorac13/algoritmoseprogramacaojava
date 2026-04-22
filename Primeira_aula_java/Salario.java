void main(){

    float salario = Float.parseFloat(IO.readln("Digite seu salário: "));
    float percentual = Float.parseFloat(IO.readln("Digite o percentual de ajuste: "));

    float novo_salario = salario * (1 + percentual/100);

    IO.println("O novo salário é: " + novo_salario);

}