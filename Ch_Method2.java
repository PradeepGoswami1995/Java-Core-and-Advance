public class Ch_Method2 {

    static int add (int a, int b)
    {
        return a+b;
        
    }

    // if i need to add more then two elements then i have to create other method
    static int add (int a, int b, int c)
    {
        return a+b+c;
        
    }

    ///it call varargs  argument with array
    static int add(int... nums) 
    {
        int sum = 0;
        for (int num : nums) 
        {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args)
     {
        System.out.println(add(10,20));
        System.out.println(add(15,8));
    
        // to add more then two element i have added a method for this 
        System.out.println(add(10,8,16));

        // System.out.println(add(8,9,50,25)); // this will give an error because the add fution can add to only three elements

        // now we can use the 
        System.out.println(add(10,5,9,10,52));
        
    }
     

    
    
}
