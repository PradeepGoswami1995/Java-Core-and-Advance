// Recursion in Java refers to the technique of a method calling itself directly or indirectly.
// When a method invokes itself, it's called a recursive method.
// Recursion is a powerful concept in programming that simplifies complex problems by breaking them down into smaller,
// more manageable subproblems.

public class ch_Recursion
 {
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    
        public static void main(String[] args)
         {
            int result = factorial(5);
            System.out.println("Factorial of 5: " + result);
        }

    
}



