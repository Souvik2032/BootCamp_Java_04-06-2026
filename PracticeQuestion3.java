package constructorDemo;

public class PracticeQuestion3 {
	PracticeQuestion3(){
		System.out.println("Constructor with Zero argument");
	}
	PracticeQuestion3(double num){
		System.out.println("Constructor with argument" +num);
	}
	PracticeQuestion3(float value){
		System.out.println("Constructor with another argument" +value);
	}
	public void display() {
		System.out.println("Displaying");
	}
	public static void main(String args[]) {
		PracticeQuestion3 obj= new PracticeQuestion3();
		obj.display();
		PracticeQuestion3 obj1= new PracticeQuestion3(12);
		obj1.display();
		PracticeQuestion3 obj2= new PracticeQuestion3(34.6);
		obj2.display();
	}
}
