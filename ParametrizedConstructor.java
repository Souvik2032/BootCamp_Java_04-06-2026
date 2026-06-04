package constructorDemo;

public class ParametrizedConstructor {
	String names;
	ParametrizedConstructor(String name){
		names=name;
		System.out.println(names + "Random names");
	}
		
		
	public static void main(String args[]) {
		ParametrizedConstructor obj=new ParametrizedConstructor("Souvik ");
		ParametrizedConstructor obj1=new ParametrizedConstructor("Rohit ");
	}
}
