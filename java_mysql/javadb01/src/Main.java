import java.sql.*;
public class Main {
    public static void main(String[] args) {
        // Parâmetros de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String password = "victor";
        
        try {
            // Estabelece a conexão com o banco de dados
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // Cria uma declaração SQL
            Statement stmt = conn.createStatement();
            
            // Executa uma consulta SQL para inserir dados
            String sql = "INSERT INTO users (nome, nascimento) VALUES ('victor', 17)";
            stmt.executeUpdate(sql);
            
            System.out.println("Dados inseridos no banco de dados.");
            
            // Fecha a conexão
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}