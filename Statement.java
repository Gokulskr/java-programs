package myproject;
public class Statement {
     public static void main(String[] args) {
         int number[]={50,65,56,71,81};
         int even=0,odd=0;
         for(int i=0;i<number.length;i++)
         {
             if((number[i]%2)==0)
             {
                 even+=1;
             }
             else{
                 odd+=1;
             }
         }
          System.out.println("Even number:"+even+"odd number"+odd);
     }
    
    
}
