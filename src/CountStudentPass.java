import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        do {
            System.out.println("Enter student amount: ");
            amount = scanner.nextInt();
        } while (amount > 30);

        double[] studentGrades = new double[amount];
        int count = 0;
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter grade of student " + (i+1));
            studentGrades[i] = scanner.nextInt();
            if (studentGrades[i] >= 5 && studentGrades[i] <= 10) count++;
        }
        System.out.println("Amount of students passed the exam: " + count);
    }
}
