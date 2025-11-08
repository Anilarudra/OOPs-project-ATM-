package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount bc = new BankAccount();
		Account_details ac1 = new Account_details(); 
		String email,password,username;
		List<Account_details> l1 = Account_details.list1;
		while(true) {
			 
			System.out.println("<---------Choose Option------------>");
			System.out.println("1. Login \n2. Register");
			System.out.print("Enter your Option : ");
			int option = sc.nextInt();
			switch(option) {
			    
			      case 1:{
			    	  System.out.println("Enter email/username : ");
			    	  String id=sc.next();
			    	  System.out.println("Enter password : ");
			    	  password=sc.next();
			    	  boolean found=false;
			    	  for(Account_details ac:l1) {
			    		  if((ac.getEmail().equals(id) || ac.getUsername().equals(id)) && ac.getPassword().equals(password) ) {
			    			    found = true;
			    			     ac1 = ac;
			    		  }
			    	  }
			  
			    	  if(found) {
			    		  int n = bc.login(id, password,ac1);
			    		  if(n==1)
			    			  System.out.println("Password is Updated.Please Login Again");
			    	  }else {
			    		  System.out.println("No user found,Please Register!");
			    	  }
			    	  break;
			 	
			      }
			      case 2:{
			    	  System.out.println("Enter email : ");
			    	  email=sc.next();
			    	  System.out.println("Enter password : ");
			    	  password=sc.next();
			    	  System.out.println("Enter username : ");
			    	  username=sc.next();
			    	  bc.Register(email, username, password);
			    	  break;
			    	  
			      }
			}
		}
		
	}

}
