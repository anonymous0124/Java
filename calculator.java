import java.util.Scanner;

public class calculator {
    public static void main(String[] argv) {
        int num, result = 0, n, i, multi = 1, option;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to calculate:");
        n = ob.nextInt();
        System.out.println("1. To perform Division");
        System.out.println("2. To perform Multiplication");
        System.out.println("3. To perform Addition");
        System.out.println("4. To perform Subtraction");
        System.out.println("5. To exit ");
        System.out.println("Enter which option you want to perform:");
        option = ob.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the first number:");
                result = ob.nextInt();
                for (i = 2; i <= n; i++) {
                    System.out.println("Enter the " + i + "th number:");
                    num = ob.nextInt();
                    if (num != 0) {
                        result = result / num;
                    } else {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                }
                System.out.println("Displaying the division of numbers:" + result);
                break;
            case 2:
                for (i = 1; i <= n; i++) {
                    System.out.println("Enter a number " + i + ":");
                    num = ob.nextInt();
                    multi = multi * num;
                }
                System.out.println("Displaying the multiplication of numbers:" + multi);
                break;
            case 3:
                for (i = 1; i <= n; i++) {
                    System.out.println("Enter a number " + i + ":");
                    num = ob.nextInt();
                    result = result + num;
                }
                System.out.println("Displaying the addition of numbers:" + result);
                break;
            case 4:
                System.out.println("Enter the first number:");
                result = ob.nextInt();
                for (i = 2; i <= n; i++) {
                    System.out.println("Enter the " + i + "th number:");
                    num = ob.nextInt();
                    result = result - num;
                }
                System.out.println("Displaying the subtraction of numbers:" + result);
                break;
            default:
                System.out.println("You have entered a wrong option. Option not found.");
                break;
        }
        ob.close();
    }
}
