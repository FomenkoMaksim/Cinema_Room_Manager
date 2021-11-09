import java.util.Scanner;

import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                System.out.print(abs(x - i) + " ");
            }
            System.out.println();
        }
    }
}