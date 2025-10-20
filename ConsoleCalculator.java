import java.util.Scanner;

public class ConsoleCalculator {
    public static int addition(int a,int b) {
        return a+b;
    }

    public static int subtraction(int a,int b) {
        return a-b;
    }

    public static int multiplication(int a, int b) {
        return a*b;
    }
    public static  int divide(int a, int b) {
        if (b==0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        System.out.println("### Java Console Calculator ###");

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter your choice (1-4): ");
            int option = sc.nextInt();

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = 0;

            switch (option) {
                case 1:
                    result = addition(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 2:
                    result = subtraction(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\n Thank you for using the calculator!");
        sc.close();
    }


}
