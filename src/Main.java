import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printMainMenu();
        while(!quit) {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    print1stMenu();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Tokio punkto nera.");
                    break;
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("\n---------------MENIU---------------");
        System.out.println("1. Tiesine ir dvejetaine paieska.");
        System.out.println("0. Iseiti is programos.");
        System.out.println("-----------------------------------");
        System.out.print("Pasirinkite norima punkta:");
    }

    public static void print1stMenu() {
        System.out.println("\n---------------TIESINE IR DVEJETAINE PAIESKA---------------");
        System.out.println("1. Tiesine paieska.");
        System.out.println("2. Dvejetaine paieska.");
        System.out.println("3. Grizti i pradzia.");
        System.out.println("0. Iseiti is programos.");
        System.out.println("-----------------------------------");
        System.out.print("Pasirinkite norima punkta:");
    }
}
