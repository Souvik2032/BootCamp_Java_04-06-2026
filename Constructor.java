package constructorDemo;

public class Constructor {
	private String name;
	Constructor(){
		System.out.println("Displayed name");
		name="Souvik Layek";
	}
		public static void main(String args[]) {
			Constructor obj = new Constructor();
			System.out.println("The name is "+ obj.name);
		}
	}


