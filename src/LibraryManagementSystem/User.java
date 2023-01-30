package LibraryManagementSystem;
import java.util.ArrayList;
public class User {
	String Name;
	int ID;
	ArrayList<String>PreviousBooks;
	 static int ind=0;
	
	User(String N){
		this.Name=N;
		this.ID=generateID();
		this.PreviousBooks=new ArrayList<String>();
		
	}
	static int generateID() {
	 ind++;
	 return ind;
	}
}
	