import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number list size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1)+ " ");
            numbers[i] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Enter number you want to delete: ");
        int elementDelete = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == elementDelete) {
                for (int j = i; j < size; j++) {
                    if (j + 1 < size) numbers[j] = numbers[j+1];
                    else numbers[j] = 0;
                }
                i--;
            }
        }
        System.out.println("List after deleting number " + elementDelete + " is: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
