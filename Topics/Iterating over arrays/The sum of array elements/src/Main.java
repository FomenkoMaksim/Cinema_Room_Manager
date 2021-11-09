import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();
        int sum = 0;
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}