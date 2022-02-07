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
public class hellooostring {
    public static void main(String[] args) {
         String name="hello java string";
        char ch=name.charAt(3);
        int length=name.length();
        System.out.println(ch);
        System.out.println("Length of the given string:"+name.length());
        System.out.println(name.substring(1,5));
        String name2=name.concat("This is concartination of string");
        System.out.println(name2);
        String replacestring=name.replace('a','e');
        System.out.println(replacestring);
        String s3=name.replace("java","was");
        System.out.println(s3);
    }
    
}
