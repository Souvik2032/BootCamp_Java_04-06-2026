package constructorDemo;

public class ConstructorWithoutThisKeyword {
	ConstructorWithoutThisKeyword(){
		System.out.println("Constructor with Zero argument");
	}
	ConstructorWithoutThisKeyword(int count){
		System.out.println("Constructor with argument" +count);
	}
	ConstructorWithoutThisKeyword(String name){
		System.out.println("Constructor with another argument" +name);
	}
	public void display() {
		System.out.println("Displaying");
	}
	public static void main(String args[]) {
		ConstructorWithoutThisKeyword obj= new ConstructorWithoutThisKeyword();
		obj.display();
		ConstructorWithoutThisKeyword obj1= new ConstructorWithoutThisKeyword(12);
		obj1.display();
		ConstructorWithoutThisKeyword obj2= new ConstructorWithoutThisKeyword("Souvik");
		obj2.display();
	}
}
