//Joao Vitor Carvalho e Vitor Almeida Costa

//Pode mudar para alterar a quantidade de alunos
int qtdAlunos = 10;

//Pra criar vetores de forma global, tem que usar float[][], pois o comando "var" não funciona
float[][] aluno = new float[qtdAlunos][1];
//[nºaluno] - [0]=media

String[][] nomesAlunos = new String[qtdAlunos][2];
//[nºaluno] - [0]=nomeAluno e [1]=situacao

void cadastrarAluno(){
    IO.println("\n=-=-=-=- Cadastro de aluno -=-=-=-=");
    for(int i=0; i<qtdAlunos; i++){
        while(true){
        boolean achou = false;
        nomesAlunos[i][0] = IO.readln("Digite o nome do " + (i+1) + "º aluno: ").toUpperCase();
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
        // Comecei fazendo para cadastrar as notas dos alunos, aí  ficaria aluno [20][4] sendo 0 a 2 as notas, e 3 a média
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
    Ordenar();
}

//Usando System out print pra deixar as colunas formatadas
void listarAlunos(){
    IO.println("\n      =-=-=-=- Lista de Alunos -=-=-=-=");
    System.out.printf("%-25s %-10s %-10s \n", "Aluno", "Média", "Situação");
    for(int i=0; i<qtdAlunos; i++){
        System.out.printf("%-25s %-10.2f %-10s \n", nomesAlunos[i][0], aluno[i][0], nomesAlunos[i][1]);
    }
    IO.println();
}

int pesquisarAluno(String pesq, String[][] nomesAlunos){
    int ini = 0;
    int fim = qtdAlunos - 1;
    while(ini <= fim){
        int meio = (ini + fim) / 2;
        int comparacao = nomesAlunos[meio][0].compareToIgnoreCase(pesq);
        if(comparacao == 0){
            return meio;
        }else if(comparacao > 0){
            fim = meio - 1;
        }else{
            ini = meio + 1;
        }
    }
    return -1;
}

void Ordenar(){
    String auxNome, auxSituacao;
    float auxMedia;
    for(int i = 0; i < qtdAlunos - 1; i++){
        for(int j = i + 1; j < qtdAlunos; j++){
            if(nomesAlunos[i][0].compareToIgnoreCase(nomesAlunos[j][0]) > 0){
                // troca os nomes
                auxNome = nomesAlunos[i][0];
                nomesAlunos[i][0] = nomesAlunos[j][0];
                nomesAlunos[j][0] = auxNome;
                // troca as situações
                auxSituacao = nomesAlunos[i][1];
                nomesAlunos[i][1] = nomesAlunos[j][1];
                nomesAlunos[j][1] = auxSituacao;
                // troca as medias
                auxMedia = aluno[i][0];
                aluno[i][0] = aluno[j][0];
                aluno[j][0] = auxMedia;
            }
        }
    }
}

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
                if(nomesAlunos[0][0] == null){
                    IO.println("\nNenhum aluno cadastrado!\n");
                    break;
                }
                String pesq = IO.readln("\nDigite o nome do aluno a ser pesquisado: ");
                int indice = pesquisarAluno(pesq, nomesAlunos);
                if(indice != -1){
                    IO.println("\nAluno: " + nomesAlunos[indice][0]);
                    IO.println("Média: " + aluno[indice][0]);
                    IO.println("Situação: " + nomesAlunos[indice][1] + "\n");
                } else IO.println("Aluno não encontrado.\n");
                break;
            case 4:
                IO.println("\nPrograma Encerrado.\n");
                break;
            default:
                IO.println("\nOpção inválida!\n");
        }
    }
}