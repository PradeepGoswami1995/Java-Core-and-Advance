

//import java.util.Scanner;

///String Methods using 
public class P1
{
    public static void main(String[]args)
    {
          //Problem1
    String name = "PRADEEP";
    name = name.toLowerCase();
    System.out.println(name);

    // Problem 2

    String text = "I am pradeep";
    text = text.replace(" ", "_");
    System.out.println(text);


    // Problem 3
    text = text.replace(("pradeep"), "Hunny");
    System.out.println(text);

    // Problem 4 (finding double spaces)

    String name1 ="double spaces  detection   ";
    System.out.println(name1.indexOf("  ")); // this detecting the double space
    System.out.println(name1.indexOf("   "));// this detecting the triple space

   // Problem 5

   String latter = "Dear pradeep\n Very good effer leanings \n \t Thank you ";
   System.out.println(latter);






    }

    
    
}