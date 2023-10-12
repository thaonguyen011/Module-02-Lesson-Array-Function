import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter property size: ");
            size = scanner.nextInt();
        } while (size > 20);

        int[] property = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter property " + (i+1));
            property[i] = scanner.nextInt();
        }

        int max = property[0];
        int index = 0;
        for (int i = 1; i < size; i++) {
            if (property[i] > max) {
                max = property[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in list is: " + max + " at position " + index);

    }
}
