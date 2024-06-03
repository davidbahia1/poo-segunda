package models;


public class Autor extends Pessoa {
    
    private Curso curso;


public Curso getCurso() {
    return curso;
}

public void setCurso(Curso curso) {
    this.curso = curso;
}

public Autor(String nome, String cpf, String email, Curso curso) {
    super(nome, cpf, email);
    this.curso = curso;
}

public Autor() {

}    
    

    
}
