import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        char alpha;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] VOWELS = {'A', 'E', 'I', 'O', 'U'};

        System.out.println("Enter any alphabet between a and z or A and Z:");
        String input = ob.next();

        if (input.length() > 1) {
            System.out.println("You have entered more than one alphabet.");
        } else {
            alpha = input.charAt(0);

            boolean isVowel = false;

            for (char vowel : vowels) {
                if (alpha == vowel) {
                    isVowel = true;
                    break;
                }
            }

            for (char VOWEL : VOWELS) {
                if (alpha == VOWEL) {
                    isVowel = true;
                    break;
                }
            }

            if (isVowel) {
                System.out.println("Entered alphabet is a vowel: " + alpha);
            } else {
                System.out.println("Entered alphabet is not a vowel: " + alpha);
            }
        }

        ob.close(); // Remember to close the Scanner
    }
}
