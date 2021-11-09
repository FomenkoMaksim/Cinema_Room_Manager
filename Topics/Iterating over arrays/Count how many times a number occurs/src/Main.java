import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int res = 0;
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                res++;
            }
        }

        System.out.println(res);
    }
}