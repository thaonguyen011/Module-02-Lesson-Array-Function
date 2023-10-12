import java.util.Scanner;

public class MaxElement {
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

        int max = numbers[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (numbers[i][j] > max) max = numbers[i][j];
            }
        }

        System.out.println("The max value of two-dimensional arrays is " + max);
    }
}
