//Vitor Almeida Costa

void cadastrarAluno(){
    IO.println("=-=-=-=- Cadastro de aluno -=-=-=-=");

    for(int i=0; i<qtdAlunos; i++){
        while(true){
            boolean achou = false;
            nomesAlunos[i][0] = IO.readln("Digite o nome do " + (i+1) + "º aluno: ");
            for(int j=0; j<i; j++){
                if(nomesAlunos[i][0].equalsIgnoreCase(nomesAlunos[j][0])){
                    achou = true;
                    break;
                }
            }
            if(!achou){
                break;
            } else {
                IO.println("Este nome já foi cadastrado! Digite outro nome.");
            }
        }
        /*
        for(int j=0; j<3; j++){
            aluno[i][j] = Float.parseFloat(IO.readln("Digite a " + (j+1) + "º nota de " + nomesAlunos[i][0] + ": "));
        }
        aluno[i][3] = (aluno[i][0] + aluno[i][1] + aluno[i][2]) / 3; //Calculo média
        */
        while(true){
            aluno[i][0] = Float.parseFloat(IO.readln("Digite a média de " + nomesAlunos[i][0] + ": "));
            if(aluno[i][0] >= 0 && aluno[i][0] <= 10){
                break;
            } else {
                IO.println("O valor da média deve estar entre 0 e 10.");
            }
        }
        IO.println();
        if(aluno[i][0] >= 7){
            nomesAlunos[i][1] = "Aprovado";
        } else {
            nomesAlunos[i][1] = "Reprovado";
        }
    }

}

void listarAlunos(){
    IO.println("=-=-=-=- Lista de Alunos -=-=-=-=");
    for(int i=0; i<qtdAlunos; i++){
        IO.println("Aluno: " + nomesAlunos[i][0] + " - Situação: " + nomesAlunos[i][1]);
    }
}

void pesquisarAluno(){
    String nome = IO.readln("Digite o nome do aluno a ser pesquisado: ");
    for(int i=0; i<qtdAlunos; i++){
        if(nomesAlunos[i][0].equals(nome)){
            IO.println("Aluno: " + nomesAlunos[i][0] + " - Situação: " + nomesAlunos[i][1]);
            return;
        }
    }
    IO.println("Aluno não encontrado.");
}

int qtdAlunos = 2;

float[][] aluno = new float[qtdAlunos][1];
//[nºaluno] - [0]=media

String[][] nomesAlunos = new String[qtdAlunos][2];
//[nºaluno] - [0]=nomeAluno e [1]=situacao

void main(){
    
    int opcao = 1;
    while(opcao != 4){  
        
        IO.println("=== MENU PRINCIPAL: GESTÃO DE TURMA ===");
        IO.println("1 - Cadastrar Alunos e Médias");
        IO.println("2 - Exibir Lista de Alunos e  Notas");
        IO.println("3 - Buscar Aluno");
        IO.println("4 - Sair");
        
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));
        
        switch(opcao){
            case 1:
                cadastrarAluno();
                break;
            case 2:
                listarAlunos();
                break;
            case 3:
                pesquisarAluno();
                break;
            case 4:
                IO.println("Programa Encerrado.");
                break;
            default:
                IO.println("Opção inválida!");
        }
    }
}