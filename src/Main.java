import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        startProgram();
    }

    public static void printMainMenu() {
        System.out.println("\n---------------------------MENIU---------------------------");
        System.out.println("---------------TIESINE IR DVEJETAINE PAIESKA---------------");
        System.out.println("1. Tiesine paieska.");
        System.out.println("2. Dvejetaine paieska.");
        System.out.println("-------------------RUSIAVIMO ALGORITMAI--------------------");
        System.out.println("3. Skaiciai.");
        System.out.println("4. Simboliai.");
        System.out.println("5. Tekstas.");
        System.out.println("---------------TIESINES DUOMENU STRUKTUROS-----------------");
        System.out.println("6. Stekas.");
        System.out.println("7. Eile.");
        System.out.println("8. Sarasas.");
        System.out.println("9. Vektorius.");
        System.out.println("-------------COMPOSITE PROJEKTAVIMO SABLONAS---------------");
        System.out.println("10. Idejimas.");
        System.out.println("11. Atvaizdavimas.");
        System.out.println("-----------------------------------------------------------");
        System.out.println("0. Iseiti is programos.");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Pasirinkite norima punkta:");
    }

        public static void startProgram() throws InterruptedException {
        boolean quit = false;
        int choice;
        printMainMenu();
        while(!quit) {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nTIESINE IR DVEJETAINE PAIESKA - Tiesine paieska");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 2:
                    System.out.println("\nTIESINE IR DVEJETAINE PAIESKA - Dvejetaine paieska");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 3:
                    System.out.println("\nRUSIAVIMO ALGORITMAI - Skaiciai");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 4:
                    System.out.println("\nRUSIAVIMO ALGORITMAI - Simboliai");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                case 5:
                    System.out.println("\nRUSIAVIMO ALGORITMAI - Tekstas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 6:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Stekas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 7:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Eile");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/;
                    break;
                case 8:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Sarasas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 9:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Vektorius");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 10:
                    System.out.println("\nCOMPOSITE PROJEKTAVIMO SABLONAS - Idejimas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 11:
                    System.out.println("\nCOMPOSITE PROJEKTAVIMO SABLONAS - Atvaizdavimas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMainMenu();*/
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("\nTokio punkto nera.");
                    TimeUnit.SECONDS.sleep(3);
                    printMainMenu();
                    break;
            }
        }
    }
}
