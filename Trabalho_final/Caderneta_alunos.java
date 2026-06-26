//Vitor Almeida Costa

void cadastrarAluno(){
    IO.println("=-=-=-=- Cadastro de aluno -=-=-=-=");
    for(int i=0; i<20; i++){
        nomesAlunos[i] = IO.readln("Digite o nome do " + (i+1) + "º aluno: ");
        for(int j=0; j<3; j++){
            aluno[i][j] = Float.parseFloat(IO.readln("Digite a " + (j+1) + "º nota de " + nomesAlunos[i] + ": "));
        }
        aluno[i][0] = (aluno[i][0][0] + aluno[i][0][1] + aluno[i][0][2]) / 3; //Calculo média
        if(aluno[i][0] >= 7.0){
            nomesAlunos[i][0] = "Aprovado";
        } else {
            nomesAlunos[i][0] = "Reprovado";
        }
    }

}

void listarAlunos(){
    
}

void pesquisarAluno(){
    
}

void main(){
    
    var aluno = new float[20][1][3];
    //[nºaluno] - [media] - [notas]
    
    var nomesAlunos = new String[20][1];
    //[nomeAluno] - [situacao]
    
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