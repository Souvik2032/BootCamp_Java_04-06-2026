package scanner_class;
import java.util.Scanner;

public class nextshort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		short value=sc.nextShort();
		System.out.println(value);
		sc.close();

	}

}