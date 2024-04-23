// using ternary operator
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        
        // Using ternary operator to check if the number is even or odd
        String result = (num % 2 == 0) ? "even" : "odd";
        
        System.out.println("Given number is " + result + ".");
        
        scanner.close();
    }
}
// without using ternary operator 
/*
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        
        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println("Given number is even.");
        } else {
            System.out.println("Given number is odd.");
        }
        
        scanner.close();
    }
}*/
