/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
class Students {
    int rollno;
    String name;
    static String College="KCT";
    Students(int R,String n){
        rollno=R;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+College);
    }
}
      public class Student{
        public static void main(String[] args){
            Students m=new Students(101,"Ravi");
            Students m1=new Students(102,"Rasi");
            m.display();
            m1.display();
            
            
        }
    }
    
    

