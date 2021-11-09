package cinema;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {
    static int rows;
    static int seatsInEachRow;
    static String[][] allSeats;
    static int purchasedTicket = 0;
    static double percent;
    static int currentIncome = 0;
    static int totalIncome = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        seatsInEachRow = scanner.nextInt();
        allSeats = new String[rows + 1][seatsInEachRow + 1];
        System.out.println();

        menu();

    }

    public static void showTheSeats(String[][] allSeats) {
        System.out.println("Cinema:");

        for (int i = 0; i < allSeats.length; i++) {
            for (int x = 0; x < allSeats[i].length; x++) {
                if (i == 0 && x == 0) {
                    System.out.print(allSeats[i][x] = "  ");
                } else if (i == 0) {
                    System.out.print(allSeats[i][x] = x + " ");
                } else if (x == 0) {
                    System.out.print(allSeats[i][x] = i + " ");
                } else if (Objects.equals(allSeats[i][x], "B ")) {
                    System.out.print("B ");
                } else {
                    System.out.print(allSeats[i][x] = "S ");
                }
            }
            System.out.println();
        }
        System.out.println();
        menu();
    }

    public static void buyTicket(int rows, int seatsInEachRow, String[][] allSeats) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int setRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int setSeat = scanner.nextInt();
        System.out.println();

        if (setRow > rows || setRow < 0) {
            System.out.println("Wrong input!");
            buyTicket(rows, seatsInEachRow, allSeats);
        } else if (setSeat > seatsInEachRow || setSeat < 0) {
            System.out.println("Wrong input!");
            buyTicket(rows, seatsInEachRow, allSeats);
        } else {
            if (Objects.equals(allSeats[setRow][setSeat], "B ")) {
                System.out.println("That ticket has already been purchased!");
                buyTicket(rows, seatsInEachRow, allSeats);
                System.out.println();
            } else {
                allSeats[setRow][setSeat] = "B ";
                if (rows * seatsInEachRow <= 60) {
                    currentIncome += 10;
                    System.out.println("Ticket price: $10");
                } else if (setRow <= rows / 2) {
                    currentIncome += 10;
                    System.out.println("Ticket price: $10");
                } else {
                    currentIncome += 8;
                    System.out.println("Ticket price: $8");
                }

                purchasedTicket++;
            }

            System.out.println();
            showTheSeats(allSeats);
        }
    }

    public static void statistic() {
        char percentChar = '%';
        percent = (double) purchasedTicket * 100 / (rows * seatsInEachRow);

        if (rows * seatsInEachRow <= 60) {
            totalIncome = rows * seatsInEachRow * 10;
        } else if (rows % 2 == 0) {
            totalIncome = (rows / 2 * seatsInEachRow * 10) + (rows / 2 * seatsInEachRow * 8);
        } else {
            totalIncome = ((rows / 2) * seatsInEachRow * 10) + ((rows - rows / 2) * seatsInEachRow * 8);
        }


        System.out.println("Number of purchased tickets: " + purchasedTicket);
        System.out.printf("Percentage: %.2f%c%n", percent, percentChar);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
        System.out.println();
        menu();
    }

    public static void menu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int numMenu = scanner.nextInt();
        System.out.println();

        switch (numMenu) {
            case 1: showTheSeats(allSeats);
            case 2: buyTicket(rows, seatsInEachRow, allSeats);
            case 3: statistic();
            case 0: break;
            default: System.out.println("Error!");
            menu();
        }
        System.out.println();
    }
}