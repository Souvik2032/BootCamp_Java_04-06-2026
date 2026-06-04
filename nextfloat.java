package scanner_class;
import java.util.Scanner;

public class nextfloat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		float value=sc.nextFloat();
		System.out.println(value);
		sc.close();

	}

}