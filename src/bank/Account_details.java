package bank;

import java.util.ArrayList;
import java.util.List;

class Account_details {

	private static String username;
	private static String email;
	private static String password;
	private static double balance;
	static List<Account_details> list1 = new ArrayList<>();
    
	public Account_details(String username2, String email2, String password2, double balance2) {
		 this.username=username2;
		 this.email=email2;
		 this.password=password2;
		 this.balance=balance2;
	}
	public Account_details() {
	     
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void addUsers(Account_details account_details) {
		
		list1.add(account_details);
		
	}
	
	
}
