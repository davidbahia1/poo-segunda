package View;

import controllers.CadastrarUsuarioDAO;
import controllers.CadastrarCurso;
import java.util.Scanner;
import models.Curso;
import models.Pessoa;


public class MenuView {
    
    public void escolhaOQueQuer(){
        System.out.println("1. Autor");
        System.out.println("2. Orientador");
        System.out.println("3. Curso");
        System.out.println("4. Trabalho Academico");
        System.out.println("5. Sair");
        System.out.println("Escolha uma opção");
    }
    public void exibeMenu(){
        System.out.println("1. Inserir");
        System.out.println("2. Excluir");
        System.out.println("3. Alterar");
        System.out.println("4. Exibir");
        System.out.println("5. Sair");
        System.out.println("\n Escolha uma das opcoes acima: ");
    }
    public void MenuCadastro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE PESSOA ===");
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF da pessoa:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o e-mail da pessoa:");
        String email = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, cpf, email);

        CadastrarUsuarioDAO cadastrarUsuarioDAO = new CadastrarUsuarioDAO();
        cadastrarUsuarioDAO.CriarUsuario(pessoa);

        System.out.println("Cadastro realizado com sucesso!");
    }
    public void MenuCadastroCurso(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE PESSOA ===");
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite a desc da pessoa:");
        String descricao = scanner.nextLine();


        Curso Curso = new Curso(nome, descricao);

        CadastrarCurso cadastrarCurso = new CadastrarCurso();
        cadastrarCurso.CriarCurso(Curso);

        System.out.println("Cadastro realizado com sucesso!");
    }
}


