import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        // print simple count 1 to 10 
        // print print 5 table 
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the value");
        int n = sc.nextInt();
        int i;
        
        sc.close();

        for(i=5; i<=n;i++)
        {
            System.out.println(i*5);

        }

        



        
    }
    
}
