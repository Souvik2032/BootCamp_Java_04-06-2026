package scanner_class;
import java.util.Scanner;

public class nextbyte {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		byte value=sc.nextByte();
		System.out.println(value);
		sc.close();

	}

}