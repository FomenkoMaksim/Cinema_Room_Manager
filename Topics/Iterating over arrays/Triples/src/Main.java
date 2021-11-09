import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();
        int triples = 0;
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] == array[i] - 1 && array[i] == array[i + 1] - 1) {
                triples++;
            }
        }

        System.out.println(triples);

    }
}
