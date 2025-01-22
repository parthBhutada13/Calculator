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
}
