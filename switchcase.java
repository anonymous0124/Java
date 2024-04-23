import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        int a,b, num;
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the value of a:");
        a = ob.nextInt();
        System.out.println("enter the value of b:");
        b = ob.nextInt();
        System.out.println("cases::\n1.Add\n2.Subtract\n3.Multiplication\n4.Devide\n5.Exit");
        System.out.println("enter which operation you want to perform:");
        num=ob.nextInt();
        switch (num) {
            case 1:
            System.out.println("addition of two integers:"+(a+b));
                break;
                case 2:
                System.out.println("Subtraction of two integers:"+(a-b));
            break;
            case 3:
            System.out.println("multiplication of two integers:"+(a*b));
            break;
            case 4:
            System.out.println("division of two integers:"+(a/b));
            break;
            default:
            System.out.println("execution terminated");
                break;
        }
        ob.close();
    }
    
}
