import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int grade;
        System.out.println("Enter your grade:");
        grade = ob.nextInt();

        if (grade < 25) {
            System.out.println("You have failed.");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("You have obtained E grade.");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("You have obtained D grade.");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("You have obtained C grade.");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("You have obtained B grade.");
        } else {
            System.out.println("You have obtained A grade.");
        }
        ob.close();
    }
}