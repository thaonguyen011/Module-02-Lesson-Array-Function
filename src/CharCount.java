import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.nextLine();
        System.out.println("Enter a char");
        char inputChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                count++;
            }
        }

        System.out.println("Frequency of character " + inputChar + " is: " + count);

    }
}
