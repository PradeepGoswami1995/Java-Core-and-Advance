public class ch_Method1 {
    public static void main(String[] args)
     {
        add(10);
        int x = 50;
        int y = 5;
        int z = 0;
        z = add(x, y);
        System.out.println("Sum: " + z);
    }

    static int add(int a, int b) 
    {
        int c;
        c = a + b;
        return c;
    
    }


    static void add()
    {
        System.out.println("method orverloading");
        
    }
    static int add(int a)
    {
        System.err.println(a);
        return a;

    }
}
