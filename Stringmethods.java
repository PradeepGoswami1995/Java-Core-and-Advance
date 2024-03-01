
//import java.util.Scanner;
public class Stringmethods {
    public static void main(String[] args) {
        String name = "Pradeep";
        int value = name.length();
        System.out.print(value);

        //creating the lower case
        String l= name.toLowerCase();
        System.out.println(l);
        
        //Creating the upper Case
        String u = name.toUpperCase();
        System.out.println(u);

        //using the Trim function that is the part of string
        String t = "   Hunny  ";
        System.out.println(t.trim());

        // or we can write
        String t1 = t.trim();
        System.out.println(t1);

        // using the substring method and getting the result 

        System.out.println(name.substring(2));

        //Printing the range of value 
        System.out.println(name.substring(2,5));

        //replace the value 

        System.out.println(name.replace('e', 'i'));


        // Start with method
        System.out.println(name.startsWith("P"));
        System.out.println(name.startsWith("e"));
        System.out.println(name.startsWith("pr"));

        //end with method
        System.out.println(name.endsWith("p"));

        System.out.println(name.endsWith("t"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("p"));
        System.out.println(name.indexOf("e"));

        
        String mn = "pradeepgoswami";
        System.out.println(mn.indexOf("p",2));
        System.out.println(mn.indexOf("d",2));

        System.out.println(mn.lastIndexOf("m"));
        System.out.println(mn.lastIndexOf("m",13));

        System.out.println(name.equals("hunny"));
        System.out.println(name.equals("Pradeep"));

        System.out.println(name.equalsIgnoreCase("praDEep"));
        System.out.println(name.equalsIgnoreCase("Prade"));


        System.out.println("iam the escape\" sequence\"");
        System.out.println("this is\\ escap ");

        
        

     
}
}
        



