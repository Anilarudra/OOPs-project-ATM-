package bank;

interface ATM {
	
	int login(String id,String password,Account_details ac);
    void Register(String email,String username, String password);
	void depoist(int amount);
	void withdraw(int amount);
	void checkBalance();
	void changePassword(String password);
	
}
