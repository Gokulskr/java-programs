/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
class Math{
    int a;
    int b;
    void display(){
        System.out.println("A"+a+" "+"B"+b);
    }
}
class add extends Math{
    
    void add(int x,int y){
        System.out.println(a+b);
    }
}
class sub extends Math{
    void sub(){
        System.out.println(a-b);
    }
}
class multiply extends Math{
    void multiply(){
        System.out.println(a*b);
    }
}

public class Maths extends Math{
    public static void main(String[] args) {
        Math m1=new Math();
        m1.a=15;
        m1.b=15;
        m1.display();
        add check1=new add();
        check1.add(m1.a,m1.b);
        
        
        
    }
    
}
