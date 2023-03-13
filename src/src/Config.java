package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Config {
	
	Connection connection;
	
	public Connection CreateConnection() {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/controle","root","");   
		}catch(Exception e){
			System.out.println(e);
		}  	
		return connection;
	}
	
	public void CloseConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
 