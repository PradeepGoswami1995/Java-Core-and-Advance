
import java.util.Scanner;

public class Switchcase18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your experience");
        int e = sc.nextInt();
        sc.close();
        
        /*
        if (e>=20){
            System.out.println("You are experinced");
        }
        else if(e>=10){
            System.out.println("Semi_experienced");
        }
        else if(e>5){
            System.out.println("you are semi_semi Experienced");
        }
        else{
            System.out.println("Junior");
        }
        */
        
        
        /* 
        switch (e) {
            case  18:
            System.out.println("you are going to become adult"); 
                break;
            case 25:
            System.out.println("your are going to getting a job");
                break;
             case 60:
             System.out.println("you are going to retired");
             break;
             default:
             System.out.println("Enjoy your life");   

             */
                //e = e/100*12;

             if (e >=42000 && e <=83000 ){
                int t = e*12/100*5;
                System.out.println("you will pay  5% tax "+t);
             }
             else if(e >=84000 && e <=200000){
                int t = e*12/100*10;
                System.out.println("You will pay 10% Tax"+t);
             } 
             else if (e >=200001 ){
                int t = e*12/100*30;
                System.out.println("You will pay 30% Tax"+t);
             }
             
             else {
                System.out.println("you will not pay any Tax");

              }    

            
        }
    }



    
        
    
