import java.util.Scanner;
public class check {
    public static void main(String[] argv){
        Scanner ob = new Scanner(System.in);
        int number;
        System.out.println("enter any number");
        number = ob.nextInt();

        if(number>0){
            System.out.println("entered number is positive");
        }
        else if(number<-0){
            System.out.println("entered number is negative");
        }
        else{
            System.out.println("re-enter number");
        }
        ob.close();
    }
    
}
