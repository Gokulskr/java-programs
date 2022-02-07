
package myproject;
interface A
{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A
{
    @Override
    public void c(){
        System.out.println("iam c method");
    }
}
class M extends  B{
    @Override
    public void a(){
        System.out.println("iam a method");
    }
    @Override
     public void display(){
        System.out.println("iam d method");
    }
      public void b(){
        System.out.println("iam b method");
    }
}
public class Hiding {
    public static void main(String[] args) {
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
    
}
