package myproject;
import java.util.Scanner;
public class Gettinginput {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter x value:");
        x=s1.nextInt();
        System.out.println("Enter y value:");
        y=s1.nextInt();
        z=x+y;
        System.out.println(z);
        
    }
}
