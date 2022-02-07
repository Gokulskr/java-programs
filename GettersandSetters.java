
package myproject;
import java.io.*;
class Get{
     private String Name;
    public String getName()
    {
        return Name;
    }
    public void SetName(String N)
    {
        this.Name=N;
    }
}
public class GettersandSetters {
    public static void main(String[] args) {
        Get obj=new Get();
        
        obj.SetName("hello getters and setters");
        System.out.println(obj.getName());
    }
    
}
