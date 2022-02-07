package myproject;
import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print("a is large");
        }
        else if(b>a && b>c){
            System.out.print("b is large");
        }
        else{
            System.out.print("c is large");
        }
        
        
        
        
    }
    
}
