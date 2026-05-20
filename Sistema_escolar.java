void main(){

    int turmas = 3;
    int alunos = 4;
    int notas = 3;

    var dadosAlunos = new float[3][4][3];
    
    int opcao = 1;

    while(opcao != 0){

        IO.println("Menu");
        IO.println("1 - Cadastrar notas.");
        IO.println("2 - Exibir boletim dos alunos.");
        IO.println("3 - Exibir média das turmas.");
        IO.println("4 - Exibir situação dos alunos.");
        IO.println("0 - Encerrar programa.");
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        switch(opcao){
            case 0:
                break;
            case 1:
                CadastroNotas(dadosAlunos, turmas, alunos, notas);
                break;
            case 2:
                ExibirBoletim(dadosAlunos, turmas, alunos, notas);
                break;
            case 3:
                //ExibirMedias();
                break;
            case 4:
                //ExibirSituacao();
                break;
            default:
                IO.println("\nOpção inválida!");
            
        }   
    }

    IO.println("\nPrograma encerrado. ");
}

void CadastroNotas(float dadosAlunos[][][], int turmas, int alunos, int notas){

    int a, t;
    while(true){
        t = Integer.parseInt(IO.readln("\nInforme a turma: ")) - 1;
        if(t >= turmas || t < 0) IO.println("\nEssa turma não existe! "); 
        else break;
    }

    while(true){
        a = Integer.parseInt(IO.readln("Informe o n° do alunos: ")) - 1;
        IO.println();
        if(a >= alunos || a < 0) IO.println("\nEssa alunos não existe! ");
        else break;
    }
    for(int i=0; i<notas; i++){
        while(true){
            float n = Float.parseFloat(IO.readln("Informe a " + (i+1) + "° nota: "));
            if(n >= 0 && n <=10) {
                dadosAlunos[t][a][i] = n;
                break;
            }
            else IO.println("A nota deve estar entre 0 e 10! ");
        }
    }
    IO.println("\nNotas do alunos n° " + a + " cadastradas\n");
}

/*2. Exibição do boletim
O sistema deverá mostrar:
•	turma;
•	aluno;
•	notas;
•	média final;
•	situação do aluno.
*/

void ExibirBoletim(float dadosAlunos[][][], int turmas, int alunos, int notas){

    System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", "Turma", "Aluno", "Nota 1", "Nota 2", "Nota 3");
    for(int i=0; i<turmas; i++){
        System.out.printf("%-70s %n", "-".repeat(70));
        for(int j=0; j<alunos; j++){
                System.out.printf("%-10d %-10d ", i+1, j+1);
            for(int k=0; k<notas; k++){
                System.out.printf("%-10.2f ", dadosAlunos[i][j][k]);
            }
            IO.println();
        }
    }
}