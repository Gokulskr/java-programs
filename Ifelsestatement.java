package myproject;
import java.util.Scanner;
public class Ifelsestatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.print("Your eligible for voting");
        }
        else
            System.out.println("your not eligible for voting");
        
        
    }
    
}
