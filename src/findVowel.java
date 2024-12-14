import java.util.Scanner;

    public class findVowel
    {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char ch = in.next().charAt(0);
            ch = Character.toUpperCase(ch);

            if(ch == 'A' ||
                    ch == 'E' ||
                    ch == 'I' ||
                    ch == 'O' ||
                    ch == 'U')
                System.out.println("you entered the Vowel");

            else
                System.out.println("the value is consonant");

        }
    }


