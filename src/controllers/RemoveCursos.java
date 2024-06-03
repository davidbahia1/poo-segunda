package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ConnBD.ConexaoBD;

public class RemoveCursos {
	
	 public void removerUsuario(){
	Connection conn = null;
	PreparedStatement st = null;
	try {
		ConexaoBD conexao =new ConexaoBD();
        Connection conn1 = conexao.getConnection();
		
		st = conn1.prepareStatement(
				"DELETE FROM cursos"
				+"WHERE"
				+"ID = ?");
		st.setInt(0, 0);
				int rowsAffected = st.executeUpdate();
				
			System.out.println("" + rowsAffected);
			
			
	}
	catch (SQLException e){
		e.printStackTrace();
	}
	finally {
		ConexaoBD.closeStatement(st);
		ConexaoBD.closeConnection();
		
		}
	 }
}

