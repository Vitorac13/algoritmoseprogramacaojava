void main() {
    IO.println("=== Simulador de Investimento ===");
    
    double depositoMensal = Double.parseDouble(IO.readln("Valor do depósito mensal: "));
    double taxaJuros = Double.parseDouble(IO.readln("Taxa de juros mensal (em %): ")) / 100;
    int tempoMeses = Integer.parseInt(IO.readln("Quantidade de meses: "));

    double saldoTotal = 0;

    for (int mes = 1; mes <= tempoMeses; mes++) {
        saldoTotal = (saldoTotal + depositoMensal) * (1 + taxaJuros);
        
        System.out.printf("Mês %d | Saldo acumulado: R$ %.2f%n", mes, saldoTotal);
    }

    IO.println("---------------------------------");
    System.out.printf("Resultado Final após %d meses: R$ %.2f%n", tempoMeses, saldoTotal);
}