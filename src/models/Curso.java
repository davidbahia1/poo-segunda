package models;

public class Curso {
    private String nome;
    private String descricao;
    private int id;

    // Construtor
    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

}
