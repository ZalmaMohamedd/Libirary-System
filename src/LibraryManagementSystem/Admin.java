package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class Admin {
	String Name="Admin";
 	int NumberOfBooks;
	int NumberOfUsers;
	ArrayList<Book>Books=new ArrayList<Book>();
	ArrayList<User>Users=new ArrayList<User>();
 	Scanner S = new Scanner (System.in);
 	
 	void InsertBook() {
		 
		 
 	    String T = S.nextLine();
 		String A = S.nextLine();
 		String D = S.nextLine();
 		int N= S.nextInt();
 		
 		
 		boolean Flag=false ;
	 	for(int i=0;i<NumberOfBooks;i++)
	 	{
	 			
	 		Book temp=Books.get(i);
	 		if (temp.Title==T)
	 		{   
	 			temp.NumberOfAvaialblesCopies+=1;
	 			Books.set(i,temp);
	 			Flag=true;
	 		}
	 	}
	 	if(Flag==false)
	 	{
	 		Book book=new Book(T,A,D, N);
	 		Books.add(book);
	 		System.out.println("book is added");
	 		NumberOfBooks+=1;}
 	}
 	
 	void SearchForBooks() {

		String title=S.nextLine();
		boolean Flag=false ;
		for(int i=0;i<NumberOfBooks;i++)
		{
			Book temp=Books.get(i);
			if (temp.Title==title)
			{
				System.out.println("Number of available copies" + temp.NumberOfAvaialblesCopies );
				 Flag=true;
			}
		}
		if(Flag==false)
			System.out.println(" Book Not Found");
			
		}
 	void DeleteCobyOfBook()
	 {	
 		String title=S.nextLine();
		boolean Flag=false;
		for(int i=0;i<NumberOfBooks;i++)
		{
			Book temp=Books.get(i);
			if (temp.Title==title)
			{   
				temp.NumberOfAvaialblesCopies-=1;
				if(temp.NumberOfAvaialblesCopies==0) 
				{   Books.remove(i);
					System.out.println("You just deleted the last copy ");
				}
				else
				{   Books.set(i,temp);
					System.out.println("Number of available copies=" + temp.NumberOfAvaialblesCopies );
				 }
				Flag=true;
				break;
			}
		}
		
		if(Flag==false)
			System.out.println(" Book Not Found");
		}
 	
 	void InsertUser() {
 		
 	
 	    String N=S.nextLine();
 	    User user=new User(N);
		Users.add(user);
		NumberOfUsers+=1;
		System.out.println("User Name :  " + user.Name);
		System.out.println(" ID : " + user.ID);
	 	}
 	
 	
 	void DeleteUser() { 
 		int id=S.nextInt();
		boolean Flag=false;
		for(int i=0;i<NumberOfUsers;i++)
		{
			User temp=Users.get(i);
			if (temp.ID==id)
				{   
				System.out.println("You just deleted : " + temp.Name);
				Users.remove(i);
				Flag=true;
				break;
				}
		if(Flag==false)
			System.out.println(" User Not Found");
			
				}
 		}
 	
	 void SearchForUser() {
		 int id=S.nextInt();
			boolean Flag=false ;
			
			for(int i=0;i<NumberOfUsers;i++)
			{
				User temp=Users.get(i);
				if (temp.ID==id)
				{	int numberofpreviousbooks=temp.PreviousBooks.size();				
					System.out.println("User Name  : " + temp.Name );
					System.out.println("User ID  : " + temp.ID );
					System.out.println("Previous Books : " );
					for(int k=0;k<numberofpreviousbooks;k++)
					{
						System.out.println("1: " + temp.PreviousBooks.get(k) );
					}
					Flag=true; 
					break;
				}
			}
			
			if(Flag==false)
				System.out.println(" ID Not Found");
				
		 
	 }
	 
 	
 	
 	
 	
 	
	 }

