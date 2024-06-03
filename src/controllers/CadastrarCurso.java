package controllers;

import ConnBD.ConexaoBD;
import models.Curso;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class CadastrarCurso {
    
    public void CriarCurso(Curso curso){
        try {
          ConexaoBD conexao =new ConexaoBD();
            Connection conn = conexao.getConnection();
            
            String sql = "INSERT INTO curso (nome, descricao) VALUES (?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,curso.getNome());
            stmt.setString(2,curso.getDescricao());
            
                
            
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
