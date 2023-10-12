import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n\nMenu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    float f1 =  scanner.nextFloat();
                    System.out.printf("Fahrenheit to Celsius result is: %f \n", fahToCel(f1));
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    float c = scanner.nextFloat();
                    ConvertTemperature example = new ConvertTemperature();

                    System.out.printf("Fahrenheit to Celsius result is: %f", example.celToFah(c));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);



    }
    public static double fahToCel(double fah) {
        return 5 * (fah -32) / 9;
    }

    public double celToFah(double cel) {
        return cel * 9/5 + 32;
    }


}
