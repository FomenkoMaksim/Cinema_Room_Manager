import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNum = scanner.nextLong();
        char sign = scanner.next().charAt(0);
        long secondNum = scanner.nextLong();

        switch (sign) {
            case '+': System.out.println(firstNum + secondNum);
            break;
            case '-': System.out.println(firstNum - secondNum);
            break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNum / secondNum);
                break;
            case '*': System.out.println(firstNum * secondNum);
            break;
            default: System.out.println("Unknown operator");
        }
    }
}