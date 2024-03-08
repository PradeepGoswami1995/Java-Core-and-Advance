public class mlarray {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 5;
        marks[1] = 10;
        marks[2] = 20;
        marks[3] = 50;
        marks[4] = 100;

        // Printing marks array
        System.out.println("Marks array:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // sum of marks
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Sum of marks: " + sum);

        // check value in the array
        int c = 20;
        boolean found = false; // Define found variable outside the loop
        for (int i = 0; i < marks.length; i++) {
            // Change the loop condition to i < marks.length
            if (c == marks[i]) {
                found = true;
                break;
            }
        }

        if (found) { // Check if found is true
            System.out.println("The value of c is in the array");
        } else {
            System.out.println("The value of c is not in the array");
        }

        // Multidimensional array
        int bin[][] = new int[3][3];
        bin[0][0] = 5;
        bin[0][1] = 10;
        bin[0][2] = 50;
        bin[1][0] = 100;
        bin[1][1] = 115;
        bin[1][2] = 120;
        bin[2][0] = 125;
        bin[2][1] = 130;
        bin[2][2] = 150;

        // Printing bin array
        System.out.println("bin array:");
        for (int i = 0; i < bin.length; i++) {
            for (int j = 0; j < bin[i].length; j++) {
                System.out.println(bin[i][j]);
            }
        }

        // Print in reverse order
        System.out.println("Reverse order of bin array:");
        for (int i = bin.length - 1; i >= 0; i--) {
            for (int j = bin[i].length - 1; j >= 0; j--) {
                System.out.println(bin[i][j]);
            }
        }
    }
}
