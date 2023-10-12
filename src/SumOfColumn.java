import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number list rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter number list columns: ");
        int col = scanner.nextInt();
        int[][] numbers = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element row " + i + " column " + j);
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter a column: ");
        int inputCol = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += numbers[i][inputCol];
        }

        System.out.println("Sum of column " + inputCol + " is: " + sum);

    }
}
