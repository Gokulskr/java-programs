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
public class splitMEthod {
    public static void main(String[] args) {
        String str="Hello java this is string";
        String[] words=str.split("\\s");
        for(String w:words){
            System.out.println(w);
    }
    
}
}