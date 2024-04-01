import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // print simple count 1 to 10 
        // print print 5 table 
        //table();
        //psmarkincremental();
        //decremental();  
        //testcount();
        //table19(); 
        fectorialpnumber();   
    }

    public static void table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the value");
        int n = sc.nextInt();
        sc.close();
        int i;
        for(i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
        // Don't close Scanner here to keep System.in open
    }

    public static void psmarkincremental() {
        int i, j;
        String k = "*";
        for (i = 0; i <= 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(k); // Print the asterisk without a newline
            }
            System.out.println(); // Move to the next line after printing the row
        }
    }

    public static void decremental()
     {
        int i, j;
        String k = "*";
        for (i = 5; i >= 0; i--) 
        {
            for (j = 0; j <= i; j++)
             {
                System.out.print(k); // Print the asterisk without a newline
            }
            System.out.println(); // Move to the next line after printing the row
        }
    }

    public static void testcount() 
    {
        for (int i = 0; i <= 10; i++) 
        {
            System.out.println(i);
        }
    }

    public static void table19() 
    {
        int r = 19;
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*r);

        }
        
    }

    public static void fectorialpnumber()
    {
        Scanner sc = new Scanner(System.in);   
        int n;
        System.out.println("please enter the Start number of factorial");
        n= sc.nextInt();
        sc.close();
        int factorial =1;
        for(int i=n;i>=1;i--)
        {
            
            factorial*= i;
        }
        System.out.print(factorial);
        
        
    }
}
