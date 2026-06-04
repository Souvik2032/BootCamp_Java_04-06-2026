package variable;

public class Local_Variable {
	public void Calculate() {
		int ht=0;
		ht=ht+5;
		System.out.println(ht);
	}
	public static void main(String args[]) {
		Local_Variable obj=new Local_Variable();
		obj.Calculate();
	}
}
