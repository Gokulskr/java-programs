/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

class World{
    int rollno;
    String name;
    float fees;
    World(int rollno,String name,float fees){
        this.rollno=rollno;
        this.name=name;
        this.fees=fees;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fees);
    }
}
public class Project {
    public static void main(String[] args) {
        World m = new World(101,"ravi",100.44f);
        World m1=new World(102,"RASi",200.20f);
        m.display();
        m1.display();
        
    }
    
}
