import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(("Enter element " + (i + 1)));
            array[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Array before reversed: ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < size/2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 -i];
            array[size - 1 - i] = temp;
        }

        System.out.printf("\n%-20s%s", "Array after reversed:  ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
