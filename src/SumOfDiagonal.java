import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number list size: ");
        int size = scanner.nextInt();

        int[][] numbers = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter element row " + i + " column " + j);
                numbers[i][j] = scanner.nextInt();
            }
        }

        int sum1= 0, sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += numbers[i][i];
            sum2 += numbers[i][size - 1 - i];
        }

        System.out.println("Sum diagonal of two-dimensional array is: " + sum1 + " and " + sum2);
    }
}
