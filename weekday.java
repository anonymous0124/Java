import java.util.Scanner;
public class weekday {
    public static void main(String[]argv){
        Scanner ob = new Scanner(System.in);
        int number;
        System.out.println("enter any number between 1 and 7:");
        number = ob.nextInt();

        switch(number){
            case 1:
                System.out.println("sunday");
            break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("frieday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
            System.out.println("number not found re-enter number between 1 and 7 ");
        }
        ob.close();
    }
}
