import java.util.*;
public class UserInput {
    int[] userInput() {
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        numbers[0] = scan.nextInt();

        System.out.println("Enter the second number:");
        numbers[1] = scan.nextInt();

        return numbers;
    }


    void performOperation() {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Choose an operation to perform:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");

            int choice = scan.nextInt();

            if (choice >= 1 && choice <= 4) {
                int[] inputs = userInput();
                switch (choice) {
                    case 1:
                        System.out.println("Sum: " + calculator.addition(inputs[0], inputs[1]));
                        break;
                    case 2:
                        System.out.println("Difference: " + calculator.subtraction(inputs[0], inputs[1]));
                        break;
                    case 3:
                        System.out.println("Product: " + calculator.multiplication(inputs[0], inputs[1]));
                        break;
                    case 4:
                        System.out.println("Result: " + calculator.division(inputs[0], inputs[1]));
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}

