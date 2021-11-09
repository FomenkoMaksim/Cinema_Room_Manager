import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArrayFirst = scanner.nextInt();
        int sizeArraySecond = scanner.nextInt();
        int[][] array = new int[sizeArrayFirst][sizeArraySecond];

        for (int i = 0; i < array.length; i++) {
            for (int x = 0;  x < array[i].length; x++) {
                array[i][x] = scanner.nextInt();
            }
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int[] ints : array) {
            for (int x = 0; x < ints.length; x++) {
                if (x == a) {
                    System.out.print(ints[b] + " ");
                } else if (x == b) {
                    System.out.print(ints[a] + " ");
                } else {
                    System.out.print(ints[x] + " ");
                }
            }
            System.out.println();
        }
    }
}