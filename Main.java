import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double choice, number1, number2;
        Scanner scan = new Scanner(System.in);
        double result = 0;
        while (true) {

            System.out.println("1- Add");
            System.out.println("2- Subtract");
            System.out.println("3- Multiply");
            System.out.println("4- Divide");
            System.out.println("5- Exit");
            System.out.println("Enter your choice:");
            choice = scan.nextDouble();
            if (choice == 5) {
                System.out.println("Exit Successfully");
                break;// exit
            }
            if (choice < 1 || choice > 4) {
                System.out.println("The choice is invalid. Please try again");
                continue;
            }
            System.out.println("Enter 1st number:");
            number1 = scan.nextDouble();
            System.out.println("Enter 2nd number:");
            number2 = scan.nextDouble();
            switch ((int) choice) {
                case 1:
                    result = number1 + number2;
                    break;
                case 2:

                    result = number1 - number2;
                    break;
                case 3:
                    result = number1 * number2;
                    break;
                case 4:
                    if (number2 == 0) {
                        System.err.println("Error: Cannot divide by zero.");
                        continue;
                    }

                    result = number1 / number2;
                    break;
                default:
                    System.out.println("The choice is invalid");

            }

            System.out.println("The result is:" + result);

        }
    }
}