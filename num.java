import java.util.Scanner;
class num {
    public static void main (String[] argv)
    {
    Scanner Ob = new Scanner(System.in);
    int number;
    System.out.println("enter the number");
    number = Ob.nextInt();

    System.out.println("user entered number is "+number);
    Ob.close();
    }
}
