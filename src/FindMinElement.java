import java.util.Scanner;

public class FindMinElement {

        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int size;

            do {
                System.out.println("Enter list size: ");
                size = scanner.nextInt();
            } while (size > 20);

            int[] property = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Enter element " + (i+1));
                property[i] = scanner.nextInt();
            }

            int min = property[0];
            int index = 1;
            for (int i = 1; i < size; i++) {
                if (property[i] < min) {
                    min = property[i];
                    index = i + 1;
                }
            }
            System.out.println("The smallest value in list is: " + min + " at position " + index);

        }


}
