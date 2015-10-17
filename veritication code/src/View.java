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
	class Comment{
		
		private int cThreadId;
		private String cAnswer;
		private String cUser;
		private String cDate;
		public Comment(int threadId, String user, String answer, String date){
			this.cThreadId = threadId;
			this.cAnswer = answer;
			this.cUser = user;
			this.cDate = date;
		}
		public int getcThreadId() {
			return cThreadId;
		}
		public String getcAnswer() {
			return cAnswer;
		}
		public String getcUser() {
			return cUser;
		}
		public String getcDate() {
			return cDate;
		}
		public void setcThreadId(int cThreadId) {
			this.cThreadId = cThreadId;
		}
		public void setcAnswer(String cAnswer) {
			this.cAnswer = cAnswer;
		}
		public void setcUser(String cUser) {
			this.cUser = cUser;
		}
		public void setcDate(String cDate) {
			this.cDate = cDate;
		}
		
	}
	private String user;
	private List<Question> questions;
	private List<Comment> comments; 
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
	
	public void commentPrint(){
		
		for(int i = 0; i < comments.size(); i++){
			System.out.println(comments.get(i).getcThreadId() +" "+comments.get(i).getcAnswer()+" " +comments.get(i).getcUser()+" " +comments.get(i).getcDate());
		}
	}
	
	public List comment(int threadId){
		comments = new LinkedList<Comment>();
		DBConnect connect = new DBConnect();
		connect.createStatement();
		String query = "SELECT * FROM lehman_hack.Comments WHERE Thread_idThread = " + threadId + " ORDER BY date DESC";
		System.out.println(query);
		connect.querySelect(query);

		try {
			while (connect.getResultset().next()) {							
				int id = Integer.parseInt(connect.getResultset().getString("Thread_idThread"));
				String un = connect.getResultset().getString("Thread_User_username");
				String cComment = connect.getResultset().getString("comment");
				String cData = connect.getResultset().getString("date");
				Comment newComment = new Comment(id, cComment, un, cData);
				comments.add(newComment);
			}
		} catch (SQLException ex) {			
			ex.printStackTrace();
		} finally {
			connect.disconnectFromDB();
		}
		return comments;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		view.allThread();
		view.print();
		view.comment(1);
		view.commentPrint();
	}

}
