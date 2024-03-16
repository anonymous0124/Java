import java.util.Scanner;
public class multi {
    public static void main(String[]argv){
        Scanner ob = new Scanner(System.in);
        int a, b,c;
        System.out.println("multiplication of two integers");
        System.out.println("enter the first number:");
        a=ob.nextInt();
        System.out.println("enter the second number:");
        b=ob.nextInt();
        c=a*b;
        System.out.println("Result:"+c);
        ob.close();
    }
}
