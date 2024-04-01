public class ch_Gettersetter {
    private String name; // Variable to hold the name of the employee
    private int age; // Variable to hold the age of the employee

    public void setName(String name) {
        // Setter method to set the name of the employee
        this.name = name;
    }

    public String getName() {
        // Getter method to return the name of the employee
        return name;
    }

    public void setAge(int age) {
        // Setter method to set the age of the employee
        this.age = age;
    }

    public int getAge() {
        // Getter method to return the age of the employee
        return age;
    }

    public static void main(String[] args) {
        // Creating an instance of ch_Gettersetter class
        ch_Gettersetter employee = new ch_Gettersetter();
        
        // Setting the name and age directly using setter methods
        employee.setName("Pradeep");
        employee.setAge(27);
        
        // Accessing the name and age using getter methods and printing them
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
    }
}
