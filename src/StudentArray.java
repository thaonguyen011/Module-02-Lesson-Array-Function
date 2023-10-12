import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        boolean isExist = false;
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        String[] arrayStudent = new String[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Enter student name " + (i+1));
            arrayStudent[i] = scanner.nextLine();
        }


        System.out.println("Enter name find: ");
        String nameFind = scanner.nextLine();

        for (int i = 0; i <  size; i++) {
            if (arrayStudent[i].equals(nameFind)) {
                System.out.println("Position of the student " + nameFind + " is: " + (i+1));
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println(nameFind + " is not found");
        }




    }
}
