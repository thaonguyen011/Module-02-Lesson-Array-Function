import java.util.Scanner;

public class AddElement {
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
        System.out.println("Enter number you want to add: ");
        int elementAdd = scanner.nextInt();
        System.out.println("Enter position you want to add: ");
        int elementPos = scanner.nextInt();


        int[] newNumber = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
           if (i == elementPos) newNumber[i] = elementAdd;
           else if ( i < elementPos) newNumber[i] = numbers[i];
           else newNumber[i] = numbers[i - 1];
        }
        System.out.println("List after adding number " + elementAdd + " is: ");
        for (int number : newNumber) {
            System.out.println(number);
        }
    }
}
