package scanner_class;
import java.util.Scanner;

public class hasNext {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        char ch=st.charAt(0);
        System.out.println(ch);
        sc.close();

    }

}