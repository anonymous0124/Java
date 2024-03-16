 //these are the example of function with parameter and return type
 // passing parameter return no value
 /*class AddNumbers {
        public static void main(String[] args) {
            // Calling the method to add two numbers and printing the result
            addNumbers(5, 10);
        }
    
        // Method to add two numbers and return no value
        public static void addNumbers(int num1, int num2) {
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        }
        } */
 // passing parameter return  value
  /*class AddNumbers {
        // Method to add two numbers and return the result
        public static int add(int a, int b) {
            return a + b;
        }
    public static void main(String[] args) {
        // Define the numbers to add
        int num1 = 5;
        int num2 = 10;

        // Call the method to add the numbers and store the result
        int sum = add(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}*/
 // passing no parameter return  value
 class AddNumbers {
    public static void main(String[] args) {
        int result = addNumbers();
        System.out.println("The result of adding 5 and 10 is: " + result);
    }

    public static int addNumbers() {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        return sum;
    }
}

