/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
class happy
{
    int x;
    happy(int x)
    {
        this.x=x;
    }
    void display()
    {
        System.out.println("happy x="+x);
    }
}
class hapiness extends happy
{
    int y;
    hapiness(int x,int y)
    {
        happy(x);
        this.y=y;
    }
void display()
{
    System.out.println("happy x="+x);
    System.out.println("happiness y="+y);
}
}
public class Super {
    public static void main(String[] args) {
        happiness s1=new happiness(100,200);
        s1.display();
    }
    
}
