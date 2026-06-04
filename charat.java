package scanner_class;
import java.util.Scanner;

public class charat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		char ch=st.charAt(3);
		System.out.println(ch);
		sc.close();

	}

}