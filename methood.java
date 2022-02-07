
package myproject;

public class methood {
    public static void main(String[] args) {
        String str="Hello java this is string";
        String s2="hello java";
        String replacing=str.replace('a','e');
        System.out.println(replacing);
        String s3=str.replace("is","was");
        System.out.println(s3);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals(s2));
        String[] words=str.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
        System.out.println(str.isEmpty());
    }
    
}
