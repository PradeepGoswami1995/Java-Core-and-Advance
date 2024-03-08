

class P2 {

    public static void main(String[] args) {
        // int [] a = new int[10];
        // for(int i=0;i<=9;i++)
        // {
        //     a[i] = i+1;
        //     System.out.println(a[i]);
        // }

        // // reverse printing 

        // for(int i=9;i>=0;i--)
        //     {
               
        //         System.out.println(i);
        //     }

            // find the maximum number of array

            int[] b = {100, 50, 25, 5, 10};

            // Initialize maxNumber with the first element of the array
            int maxNumber = b[0];
    
            // Loop through the array to find the maximum number
            for (int i = 1; i < b.length; i++) {
                if (b[i] > maxNumber) {
                    maxNumber = b[i];
                }
            }
    
            // Print the maximum number found
            System.out.println("Maximum number in the array: " + maxNumber);

            //write programe for find the sum of all eliments


            int sum = 0;
    
            for (int i = 0; i < b.length; i++) {
                sum = b[i] + sum;
            }
    
            // Print the sum after the loop finishes
            System.out.println("Sum of all elements: " + sum);
        
    
        
    }

    

        

    
}


