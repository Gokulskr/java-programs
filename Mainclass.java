/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

interface printable
{
    void print();
}
class A12 implements printable{
    public void print()
    {
        System.out.println("Hello");
    }
    
}
public class Mainclass {
    public static void main(String[]args){
        A12 obj=new A12();
        obj.print();
    }    
}
