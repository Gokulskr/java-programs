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
class Myway{
    int rollno;
    String name;
    int mark;
    void display(){
        System.out.println("Rollno:"+rollno+"Name:"+name+"Mark:"+mark);
    }
}
class teacher extends Myway{
    float Attendance;
    void Attendance(){
        System.out.println("Attendance:"+Attendance);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        teacher t1=new teacher();
        t1.rollno=123;
        t1.name="swathi";
        t1.mark=80;
        t1.Attendance=95.5f;
        t1.display();
        t1.Attendance();
    }
    
}
