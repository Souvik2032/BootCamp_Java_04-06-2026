package scanner_class;
import java.util.Scanner;

public class nextlong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		long value=sc.nextLong();
		System.out.println(value);
		sc.close();

	}

}