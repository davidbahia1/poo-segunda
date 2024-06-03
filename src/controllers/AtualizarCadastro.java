package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConnBD.ConexaoBD;

public class AtualizarCadastro {

	public void atualizarUsuario() {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = ConexaoBD.getConnection();
			st = conn.prepareStatement(
					"UPDATE pessoa"
					+"SET Nome = Nome + ?"
					+"SET Cpf = Cpf + ?"
					+"SET Email = Email + ?"
					+"WHERE"
					+ "DepartamentCpf = ?");
			st.setString(0, null);
			st.setString(0, null);
			st.setString(0, null);
			st.setString(0, null);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("linha atualizada" + rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			ConexaoBD.closeStatement(st);
			ConexaoBD.closeConnection();
		}
		
	}
	
}
