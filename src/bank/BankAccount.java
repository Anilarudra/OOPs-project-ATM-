package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount implements ATM {
	
	
	Account_details ac = new Account_details();
    
	@Override
	public void depoist(int amount) {
		if(amount >0 && amount%100==0)
		       ac.setBalance(ac.getBalance()+ amount);
		else 
			  System.out.println("Enter Valid amount");
		
	}

	@Override
	public void withdraw(int amount) {
		
		if(amount >0 && amount%100==0 ) {
			if(ac.getBalance() > amount ) {
				
				 ac.setBalance(ac.getBalance()- amount);
			}else {
				System.out.println("Insufficient Balance");
			}

		}else {
			   System.out.println("Enter Valid amount");
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance : " + ac.getBalance() +" Rupees");

	}

	@Override
	public int login(String id, String password,Account_details ac1) {
		ac=ac1;
		int n=0;
		BankAccount bc = new BankAccount();
		boolean flag=true;
		
			if(ac.getEmail()==null || ac.getPassword()==null || ac.getUsername()==null) {
				
				flag=false;
				
			}
			if(flag) {
			if((ac.getEmail().equals(id) || ac.getUsername().equals(id)) && ac.getPassword().equals(password)) {
				
				System.out.println("Login Successfull");
		    	Scanner sc  = new Scanner(System.in);
		    	while(flag) {
		    		System.out.println("--------Operations----------");
		    		System.out.println("1. Deposit \n2. Withdraw \n3. Balance Enqcuiry \n4. ChangePasswaord "
		    				+ "\5. My Details");
		    		System.out.println("Enter Your option:");
		    		int option = sc.nextInt();
		    		switch(option) {
		    		
		    		        case 1:{
		    			          System.out.println("Enter amount to Deposit in hundred multiples only : ");
		    			          bc.depoist(sc.nextInt());
		    			          break;
		    			  
		    		        }
		    		        case 2:{
		  			              System.out.println("Enter amount to withdraw in hundred multiples only : ");
		  			              bc.withdraw(sc.nextInt());
		  			              break;
		  			  
		  		            }
		    		        case 3:{
		    		        	  bc.checkBalance();
		    		        	  break;
		    		        }
		    		        case 4:{
		    		        	  System.out.println("Enter New Password :");
		    		        	  bc.changePassword(sc.next());
		    		        	  flag=false;n=1;
		    		        	  break;
		    		        }
		    		        case 5:{
		    		        	  bc.getDetails();
		    		        	  break;
		    		        }
		    		        
		    		}
		    	}
				 
			}
		  }
		
		
	return n;
	}


	private void getDetails() {
		System.out.println("<-----My Details------> ");
		System.out.println("Name : "+ ac.getUsername() +"\n Email: "+ ac.getEmail() +"\nBalance : "+ac.getBalance());
		
	}

	@Override
	public void Register(String email,String username, String password) {
		Account_details ac2 = new Account_details();
		ac2.setUsername(username);
		ac2.setEmail(email);
		ac2.setPassword(password);
		System.out.println("Registration Successful");
		ac2.addUsers(new Account_details(ac2.getUsername(),ac2.getEmail(),ac2.getPassword(),ac2.getBalance()));
		
		
	}

	@Override
	public void changePassword(String s) {
		ac.setPassword(s);
		
	}

}
