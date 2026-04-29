void main() {
    IO.println("=== Simulador de Investimento ===");
    
    double depositoMensal = Double.parseDouble(IO.readln("Valor do depósito mensal: "));
    double taxaJuros = Double.parseDouble(IO.readln("Taxa de juros mensal (em %): ")) / 100;
    int tempoMeses = Integer.parseInt(IO.readln("Quantidade de meses: "));
    int mes = 1;

    double saldoTotal = 0;

    while(mes <= tempoMeses){
        
        saldoTotal = (saldoTotal + depositoMensal) * (1 + taxaJuros);  
        System.out.printf("Mês %d | Saldo acumulado: R$ %.2f%n", mes, saldoTotal);
        
        mes++;
    }

    IO.println("---------------------------------");
    System.out.printf("Resultado Final após %d meses: R$ %.2f%n", tempoMeses, saldoTotal);
}