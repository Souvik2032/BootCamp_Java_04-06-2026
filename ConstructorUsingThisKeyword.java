package constructorDemo;

public class ConstructorUsingThisKeyword {
	ConstructorUsingThisKeyword(){
		this(10);
		System.out.println("Constructor with Zero argument");
	}
	ConstructorUsingThisKeyword(int count){
		this("Souvik");
		System.out.println("Constructor with argument " +count);
	}
	ConstructorUsingThisKeyword(String name){
		System.out.println("Constructor with another argument " +name);
	}
	
	public static void main(String args[]) {
		ConstructorUsingThisKeyword obj= new ConstructorUsingThisKeyword();
	}
}
