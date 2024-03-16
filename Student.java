/*import  java.util.Scanner;
public class student {
  Scanner Ob = new Scanner(System.in);
  public student (String name);
  {
    String name;
        System.out.println("enter your name");
        name=Ob.nextLine();
        return name;
}
    public static int main(String[] argv) {
      String id = student ();
      System.out.println("my name is "+name);
    }
}*/
import java.util.Scanner;

public class Student {
    static Scanner Ob = new Scanner(System.in);

    public static String getName() {
        System.out.println("Enter your name:");
        String name = Ob.nextLine();
        return name;
    }

    public static void main(String[] args) {
        String name = getName();
        System.out.println("My name is " + name);
    }
}

