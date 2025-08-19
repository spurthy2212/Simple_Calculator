import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        boolean flag = true;  // flag

        while (flag) {
            // Display Menu
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting... Thank you!");
                flag = false;
                continue;
            }

            if (choice >= 1 && choice <= 4) {
                // Ask inputs only once
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result = " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result = " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result = " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result = " + result);
                        } else {
                            System.out.println("Error! Division by zero not allowed.");
                        }
                        break;
                }
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
