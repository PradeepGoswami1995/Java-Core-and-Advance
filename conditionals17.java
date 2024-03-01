public class conditionals17 {
    public static void main(String[] args) {
        int age = 18;

        if (age>=18)
        {
            System.out.println("Yes Boy you can drive");
        }
        // else is options as per the requirementst:
        else 
        {
            System.out.println("you can not be drive");
        }

        int age2 = 24;
        boolean cond = age2>= 18; 

        if (cond)
        {
            System.out.println("you can drive");
        }
        else{
            System.out.println("you can't drive");
        }


        boolean a = true;
        boolean b = false;

        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if (a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
    
        }

        // not operator

        if (!a && !b ){
            System.out.println("y");

        }
        else{
            System.out.println("N");
        }


    }
    
}
