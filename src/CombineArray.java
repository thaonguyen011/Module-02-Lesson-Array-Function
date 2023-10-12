import java.util.Scanner;

public class CombineArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number list 1 size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i+1));
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter number list 2 size: ");
        int size2 = scanner.nextInt();
        int[] numbers2 = new int[size];

        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element " + (i+1));
            numbers2[i] = scanner.nextInt();
        }

        int[] result = new int[size + size2];

        System.out.println("Concat 2 arrays:");
        for (int i = 0; i < (size + size2); i++) {
            if ( i >= size) {
                result[i] = numbers2[i-size];
            } else result[i] = numbers[i];
            System.out.println(result[i]);
        }
    }
}
