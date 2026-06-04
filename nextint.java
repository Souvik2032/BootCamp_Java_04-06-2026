package scanner_class;
import java.util.Scanner;

public class nextint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int value=sc.nextInt();
		System.out.println(value);
		sc.close();

	}

}