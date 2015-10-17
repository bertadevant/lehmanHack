import java.sql.SQLException;


public class User {
	private String name;
	
	public User(){
		
	}
	public User(String name, String passWord){
		if(isRegister(name, passWord)){
			System.out.println("Verified");
			this.name = name;
		}else{
			System.out.println("No this user");
		}
	}
	
	public boolean isRegister(String name, String passWord){
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "SELECT * FROM lehman_hack.User WHERE username = '" + name +"'AND pass = '" + passWord +"'";
		System.out.println(query);
		connect.querySelect(query);

		try {
			if (connect.getResultset().next()) {							
				return true;				
			}
		} catch (SQLException ex) {			
			ex.printStackTrace();
		} finally {
			connect.disconnectFromDB();
		}
		return false;
	}
	public void creatUser(String userName, String passWord, String creditCard, int status){			
		CCVerication cc = new CCVerication(creditCard);
		if(cc.isValid()){
			DBConnect connect = new DBConnect();
			connect.createStatement();
			String query = "INSERT INTO lehman_hack.User (username, pass, creditcard, status) VALUES ('" 
					+ userName +"', '"+ passWord + "', '"+creditCard+"', '"+status+"')";
			System.out.println(query);
			connect.queryChange(query);	
			connect.disconnectFromDB();
			name = userName;
		}		
	}
	
	public void creatUser(String userName, String passWord, String creditCard, int status, int theraphist){
		CCVerication cc = new CCVerication(creditCard);
		if(cc.isValid()){
			DBConnect connect = new DBConnect();
			connect.createStatement();
			String query = "INSERT INTO lehman_hack.User VALUES ('" 
					+ userName +"', '"+ passWord + "', '"+creditCard+"', '"+status+"', '" +theraphist+"')";
			System.out.println(query);
			connect.queryChange(query);	
			connect.disconnectFromDB();
		}		
	}
	
	public void askQuesiton(String question, String description){
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "INSERT INTO lehman_hack.Thread (title, post, closed, censured, User_username) VALUES ('" 
				+ question +"', '"+ description + "', "+0+", "+0+", '"+ name +"')";
		System.out.println(query);
		connect.queryChange(query);	
		connect.disconnectFromDB();
	}
	
	public void comment(int threadId, String answer){
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "INSERT INTO lehman_hack.Comments (Thread_idThread, Thread_User_username, comment, censured) VALUES (" 
				+ threadId +", '"+ name + "', '"+answer+"', "+0+")";
		System.out.println(query);
		connect.queryChange(query);	
		connect.disconnectFromDB();
	}
	
	//true for thread, false for comment
	public void vote(boolean flag, int tcId, String user, int type){
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "";
		if(flag){
			query = "INSERT INTO lehman_hack.ThreadVotes (Thread_idThread, User_username, type) VALUES (" 
					+ tcId + ", '"+user+"', "+type+")";			
		}else{
			query = "INSERT INTO lehman_hack.CommentVotes (Comment_idComment, User_username, type) VALUES (" 
					+ tcId + ", '"+user+"', "+type+")";
		}		
		System.out.println(query);
		connect.queryChange(query);	
		connect.disconnectFromDB();
	}
	//**************************************************************
	//direction -> 0: down; 1: up
	public int countVote(boolean flag, String name, int direction){
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "";
		if(flag){
			query = "SELECT * FROM lehman_hack.ThreadVotes WHERE User_username = '" + name +"'AND type = " + direction;
		}else{
			query = "SELECT * FROM lehman_hack.CommentVotes WHERE User_username = '" + name +"'AND type = " + direction;
		}
		System.out.println(query);
		connect.querySelect(query);
		int count = 0;
		try {
			while (connect.getResultset().next()) {							
				count++;			
			}
		} catch (SQLException ex) {			
			ex.printStackTrace();
		} finally {
			connect.disconnectFromDB();
		}
		return count;
	}
	//*********************************************************************
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
//		user1.creatUser("heck7", "pass1", "4388576018410707", 4);
//		user1.askQuesiton("vew Tire", "not sure where to start");
//		User user2 = new User("heck4", "pass1");
		User user2 = new User("heck5", "pass1");
//		user2.comment(1, "work harder");
//		user2.vote(true, 1, user2.getName(), 1);
//		user2.vote(true, 3, user2.getName(), 0);
		System.out.println(user2.countVote(false, "heck5", 1));
//		user1.isRegister();
//		user2.creatUser("heck2", "pass2", "4388576018410707", 5);
//		user2.askQuesiton("I need help with coding", "not sure where to start");
	}

}
