import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
double num1 = sc.nextDouble();   

System.out.print("Enter operator (+, -, *, /): ");
char operator = sc.next().charAt(0);

System.out.print("Enter second number: ");
double num2 = sc.nextDouble();

double result;

switch (operator) {
    case '+':
        result = num1 + num2;
        break;

    case '-':
        result = num1 - num2;
        break;

    case '*':
        result = num1 * num2;
        break;

    case '/':
                try {
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }

                    result = num1 / num2;

                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
