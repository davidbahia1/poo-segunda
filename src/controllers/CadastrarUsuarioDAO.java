package controllers;

import ConnBD.ConexaoBD;
import models.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarUsuarioDAO {
    
    public void CriarUsuario(Pessoa pessoa){
        try {
            ConexaoBD conexao = new ConexaoBD();
            Connection conn = conexao.getConnection();
            
            String sql = "INSERT INTO pessoa (nome, cpf, email) VALUES (?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getEmail());
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Dados inseridos com sucesso!");
            }
            
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir os dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
