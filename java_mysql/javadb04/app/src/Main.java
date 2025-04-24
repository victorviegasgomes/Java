import java.sql.Connection;
import java.sql.DriverManager;


	public class Main {
		public static final String username = "root";
		public static final String password = "victor";
		public static final String db_url = "jdbc:mysql://localhost:3306/AGENDA";
	
		public static Connection connectionToMySQL() throws Exception {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection connection = DriverManager.getConnection(db_url, username, password);
	  
	  return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Connection connect = connectionToMySQL();
		
		if(connect != null) {
	    	System.out.println("conexão obtida: " + connect);
	    	connect.close();
		}
	}
}
