package myproject;

import java.io.IOException;

public class Cases {
     public static void main(String[] args) {
         char choice;
         System.out.println("select your choice");
         System.out.println("M ---> Madras");
         System.out.println("B ---->Bombay");
         System.out.println("C --->calcutta");
         System.out.println("choice--->");
         System.out.flush();
         try
         {
             switch(choice=(char)System.in.read())
             {
                 case 'M':
                 case 'm':System.out.println("Madras:Booklet 5");
                 break;
                 case 'B':
                 case 'b':System.out.println("Bombay:booklet 9");
                 break;
                 case 'C':
                 case 'c':System.out.println("Calcutta:booklet 5");
                 break;
                 default:System.out.println("Invalid choice(IC)");
                 
             }
         }
         catch(IOException e){
             System.out.println("I/O error");
         }
         
     }
    
}
