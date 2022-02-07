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
public class Rectangle {
    int length,width;
    void getData(int x,int y){
        length=x;
        width=y;
            System.out.println("x"+x);
            System.out.println("y"+y);
    }
    int rectArea(){
        int Area=length*width;
        System.out.println("Area"+Area);
        return(Area);
    }

}
class RectArea{
    public static void main(String[] args){
        int area1,area2;
        Rectangle Rect1=new Rectangle();
        Rectangle Rect2=new Rectangle();
        Rect1.length=15;
        Rect1.width=10;
        area1=Rect1.length*Rect1.width;
        Rect2.getData(20,12);
        area2=Rect2.rectArea();
        System.out.println("Area 1="+area1);
        System.out.println("Area 2="+area2);
        
        
        
    }
}

