public class Calculator {
    int addition(int num1, int num2) {
        return num1 + num2;
    }

    int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    float division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is invalid!");
            return 0.0f;
        } else {
            return (float) num1 / num2;
        }
    }
}
