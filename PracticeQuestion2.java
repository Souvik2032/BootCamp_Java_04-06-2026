package variable;

public class PracticeQuestion2 {
	int account_number;
	String acc_holder_name;
	int balance;
	String branch_name;
	
	public static void main(String[] args) {
		PracticeQuestion2 obj=new PracticeQuestion2();
		obj.account_number=11002233;
		obj.acc_holder_name="Sita Raman";
		obj.balance=10000000;
		obj.branch_name="Coforge Ltd HDFC";
		System.out.println(obj.account_number);
		System.out.println(obj.acc_holder_name);
		System.out.println(obj.balance);
		System.out.println(obj.branch_name);
		
	}

}
