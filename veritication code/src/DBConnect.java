import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultset = null;
	
	public DBConnect(){
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://mysqlhack.bertadevant.com/lehman_hack", "hack1", "lehmanhack12");
			System.out.println("connect");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Statement createStatement(){
		try {			
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}
	
	public void queryChange(String search){		
		try {
			statement.executeUpdate(search);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public ResultSet querySelect(String search){
		try {
			resultset = statement.executeQuery(search);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultset;
	}
	
	
	public void disconnectFromDB(){
		if(resultset != null){
			try{
				resultset.close();
			}catch(SQLException ignore){}
		}
		
		if(preparedStatement != null){
			try{
				preparedStatement.close();
			}catch(SQLException ignore){}
		}
		
		if(statement != null){
			try{
				statement.close();
			}catch(SQLException ignore){}
		}
		if(connection != null){
			try{
				connection.close();
			}catch(SQLException ignore){}
		}	
	}	
	public ResultSet getResultset() {
		return resultset;
	}
	
	public static void main(String[] args){
		DBConnect db = new DBConnect();
	}
}
