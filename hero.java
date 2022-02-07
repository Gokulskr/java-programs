
package myproject;
abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }
abstract void run();
void changeGear(){
System.out.println("gear changed");
}
}
class honda extends Bike
        {
    @Override
    void run(){
        System.out.println("Running safely");
    }
}

public class hero {
    public static void main(String[] args) {
        Bike obj=new honda();
        obj.run();
        obj.changeGear();
    }
    
}
