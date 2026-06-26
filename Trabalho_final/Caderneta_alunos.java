void cadastrarAluno(){

}

void listarAlunos(){
    
}

void pesquisarAluno(){
    
}

void main(){

int opcao = 1;
while(opcao != 4){  

    IO.println("1 - Cadastrar Alunos e Médias");
    IO.println("2 - Exibir Lista de Alunos e  Notas");
    IO.println("3 - Buscar Aluno");
    IO.println("4 - Sair");
    opcao = Integer.ParseInt(IO.readln("Escolha uma opção: "));
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