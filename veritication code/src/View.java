import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class View {
	class Question{
		private int threadId;
		private String title;
		private String user;
		private String date;
		public Question(int threadId, String title, String user, String date){
			this.threadId = threadId;
			this.title = title;
			this.user = user;
			this.date = date;
		}
		public int getThreadId() {
			return threadId;
		}
		public String getTitle() {
			return title;
		}
		public String getUser() {
			return user;
		}
		public String getDate() {
			return date;
		}
		public void setThreadId(int threadId) {
			this.threadId = threadId;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public void setDate(String date) {
			this.date = date;
		}
		
	}
	
	private String user;
	private List<Question> questions;
	public View(){
		
	}
	public View(String user){
		this.user = user;
	}
	
	public List allThread(){
		questions = new LinkedList<Question>();
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "SELECT * FROM `Thread` ORDER BY date DESC";
		System.out.println(query);
		connect.querySelect(query);

		try {
			while (connect.getResultset().next()) {	
				int id = Integer.parseInt(connect.getResultset().getString("idThread"));
				String ti = connect.getResultset().getString("title");
				String User_username = connect.getResultset().getString("User_username");
				String da = connect.getResultset().getString("date");
				Question newQuestion = new Question(id, ti, User_username, da);
				questions.add(newQuestion);
			}
		} catch (SQLException ex) {			
			ex.printStackTrace();
		} finally {
			connect.disconnectFromDB();
		}
		return questions;
	}
	
	public void print(){
		
		for(int i = 0; i < questions.size(); i++){
			System.out.println(questions.get(i).getTitle() +" " +questions.get(i).getUser()+" " +questions.get(i).getDate());
		}
	}
	
	public String comment(int threadId){
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "SELECT * FROM lehman_hack.Thread WHERE username = '" + user +"'AND pass = '" + passWord +"'";
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		view.allThread();
		view.print();
	}

}
