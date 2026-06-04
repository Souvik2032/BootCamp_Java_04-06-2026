package scanner_class;
import java.util.Scanner;

public class nextline {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println(name);
		sc.close();

	}

}