package myproject;
import java.util.Scanner;
public class NesledIf {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Integer:");
        int n=sc.nextInt();
        if(!(n==0)){
            if(n%2==0){
                System.out.println("The given nuber is even");
            }
            else{
                System.out.print("The given number is odd");
            }
            
        }
        else{
            System.out.println("Enter a valid number without zero");
        }
        
    }
    
}
