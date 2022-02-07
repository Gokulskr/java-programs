package myproject;
import java.util.Scanner;


public class GettingInputFromUser {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.print("enter a another number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The value is:"+c);
    }
    
}
