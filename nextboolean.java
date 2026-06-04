package scanner_class;

import java.util.Scanner;

public class nextboolean {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 values");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter value for bool");
        boolean value=sc.nextBoolean();

        if (a<b){
            System.out.println(value);
        }else{
            System.out.println("False");
        }

        sc.close();
    }
}