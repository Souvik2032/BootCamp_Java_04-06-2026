package bankAccount;

public class TravellingSystem {
	String pickup;
	String drop_point;
	int arriving_time;
	
	public void raindelay() {
		arriving_time=arriving_time+30;
		System.out.println("Rain update time "+ arriving_time);
	}
	
	public void display() {
		System.out.println("Item name "+pickup );
		System.out.println("Order status "+drop_point );
		System.out.println("Rain update time "+ arriving_time);
	}
	
	public static void main(String[] args) {
		TravellingSystem obj=new TravellingSystem();
		obj.pickup="Biriyani";
		obj.drop_point="Preparing";
		obj.arriving_time=20;
		obj.display();
		obj.raindelay();
		

	}

}
