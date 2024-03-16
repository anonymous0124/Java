import java.util.Scanner;
class input {
    public static void main(String[] argv)
    {
        Scanner ob = new Scanner(System.in);
        String name;
        long number;

        System.out.println("enter your full name:");
        name = ob.nextLine();
        System.out.println("enter your number"); 
        number= ob.nextLong();   

        System.out.println("user full name is "+name);
        System.out.print("number is "+number);
        ob.close();
    }
}
