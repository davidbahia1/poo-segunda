package ConnBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConexaoBD {
    
    public static Connection getConnection(){
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/TrabalhoAcademico";
            String nome_bd = "root";
            String senha_bd = "2907";
            
            System.out.println("Conectado com Sucesso");
            return DriverManager.getConnection(url, nome_bd, senha_bd);
        } catch (Exception e) {
            System.out.println("não foi possivel conectar");
            return null;
        }
        
    }

	public static void closeStatement(PreparedStatement st) {
		// TODO Auto-generated method stub
		
	}

	public static void closeConnection() {
		// TODO Auto-generated method stub
		
	}
   
}
