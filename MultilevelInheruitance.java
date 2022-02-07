/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author NextGen
 */
class animal{
    void eat(){
        System.out.println("eating");
        
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking");
    }
}
class babydog extends dog{
    void wheep(){
        System.out.println("Weeping");

}
}
public class MultilevelInheruitance {
    public static void main(String[] args) {
        babydog b=new babydog();
        b.eat();
        b.bark();
        b.wheep();
    }
    
}
