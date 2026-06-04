package bankAccount;

public class Swiggy {
	String item_name;
	String order_status;
	int expected_time;
	double Amount;
	
	public void rainCharge() {
		Amount=Amount+30;
		System.out.println("Rain update charge "+ Amount);
	}
	
	public void display() {
		System.out.println("Item name "+item_name );
		System.out.println("Order status "+order_status );
		System.out.println("Expeted time "+ expected_time);
		System.out.println("Rain update charge "+ Amount);
	}
	
	public static void main(String[] args) {
		Swiggy obj=new Swiggy();
		obj.item_name="Biriyani";
		obj.order_status="Preparing";
		obj.expected_time=20;
		obj.Amount=200;
		obj.display();
		obj.rainCharge();
		

	}

}
