import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] star = new String[n][n];

        for (int i = 0; i < star.length; i++) {
            for (int x = 0; x < star[i].length; x++) {
                star[i][x] = ". ";
            }
        }

        for (int i = 0; i < star.length; i++) {
            for (int x = 0; x < star[i].length; x++) {
                if (i == x) {
                    System.out.print("*" + " ");
                } else if (x == n - 1 - i) {
                    System.out.print("*" + " ");
                } else if (x == star.length / 2) {
                    System.out.print("*" + " ");
                } else if (i == star.length / 2) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("." + " ");
                }
            }
            System.out.println();
        }
    }
}