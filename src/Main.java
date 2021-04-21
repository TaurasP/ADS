import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        startProgram(createCars());
    }

    public static List<Car> createCars() {
        List<Car> cars = new ArrayList<>();

        Car mazdaCX5 = new Car("Mazda", "CX-5");
        Car mazda5 = new Car("Mazda", "5");
        Car bmwX5 = new Car("BMW", "X5");

        cars.add(mazdaCX5);
        cars.add(mazda5);
        cars.add(bmwX5);

        return cars;
    }

    public static void printMenu() {
        System.out.println("\n---------------------------MENIU---------------------------");
        System.out.println("---------------TIESINE IR DVEJETAINE PAIESKA---------------");
        System.out.println("1. Tiesine paieska pagal raktini zodi.");
        System.out.println("2. Tiesine paieska pagal raktini zodi is automobilio objekto.");
        System.out.println("3. Dvejetaine paieska pagal raktini zodi.");

        System.out.println("-------------------RUSIAVIMO ALGORITMAI--------------------");
        System.out.println("4. Skaiciai.");
        System.out.println("5. Simboliai.");
        System.out.println("6. Tekstas.");

        System.out.println("---------------TIESINES DUOMENU STRUKTUROS-----------------");
        System.out.println("7. Stekas.");
        System.out.println("8. Eile.");
        System.out.println("9. Sarasas.");
        System.out.println("10. Vektorius.");

        System.out.println("-------------COMPOSITE PROJEKTAVIMO SABLONAS---------------");
        System.out.println("11. Idejimas.");
        System.out.println("12. Atvaizdavimas.");

        System.out.println("-----------------------------------------------------------");
        System.out.println("0. Iseiti is programos.");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Pasirinkite norima punkta:");
    }



        public static void startProgram(List<Car> cars) throws InterruptedException {

        boolean quit = false;
        int choice;
        printMenu();

        while(!quit) {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Car.linearNumbersSearch();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 2:
                    //System.out.println("\nTIESINE IR DVEJETAINE PAIESKA - Tiesine paieska pagal raktini zodi is automobilio objekto.");
                    Car.linearCarsSearch(cars);
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 3:
                    Car.binaryNumbersSearch();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 4:
                    System.out.println("\nRUSIAVIMO ALGORITMAI - Skaiciai");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 5:
                    System.out.println("\nRUSIAVIMO ALGORITMAI - Simboliai");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                case 6:
                    System.out.println("\nRUSIAVIMO ALGORITMAI - Tekstas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 7:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Stekas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 8:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Eile");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 9:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Sarasas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 10:
                    System.out.println("\nTIESINES DUOMENU STRUKTUROS - Vektorius");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 11:
                    System.out.println("\nCOMPOSITE PROJEKTAVIMO SABLONAS - Idejimas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 12:
                    System.out.println("\nCOMPOSITE PROJEKTAVIMO SABLONAS - Atvaizdavimas");
                    /*TimeUnit.SECONDS.sleep(3);
                    printMenu();*/
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("\nTokio punkto nera.");
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
            }
        }
    }
}
