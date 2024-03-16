import java.util.Scanner;
public class grade {
public static void main(String[]argv)
{
    Scanner ob= new Scanner(System.in);
    int grade;
    System.out.println("enter you grade:");
    grade=ob.nextInt();
    if(grade<25){
        System.out.println("you are fail");
    }
        if(grade<45){
            System.out.println("you have obtained E grade");
        }
            if(grade<50){
                System.out.println("you have obtained D grade");
            }
                if(grade<60){
                    System.out.println("you have obtained C grade");
                }
                    if(grade<80){
                        System.out.println("you have obtaibed B grade");
                    }
                        if (grade>80) {
                            System.out.println("you have obtained A grade");
                        }
    ob.close();
}
}
