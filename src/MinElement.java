import java.util.Scanner;

public class MinElement {

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

            int min = numbers[0][0];

            for (int i = 0; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    if (numbers[i][j] < min) min = numbers[i][j];
                }
            }

            System.out.println("The min value of two-dimensional arrays is " + min);
        }


}
