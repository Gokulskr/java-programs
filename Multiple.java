/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

interface printings
{
    void print();
}
interface showable
{
    void show();
}
class A14 implements printings,showable{
    public void print()
    {
        System.out.println("HEllo");
    }
    public void show()
    {
        System.out.println("world");
        
    }
}
public class Multiple {
    public static void main(String[] args) {
        A14 obj=new A14();
        obj.print();
        obj.show();
        
    }
    
}
