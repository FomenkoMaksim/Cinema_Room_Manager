import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res;
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        res = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < res) {
                res = array[i];
            }
        }

        System.out.println(res);
    }
}