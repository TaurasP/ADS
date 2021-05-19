import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<>();
    public static Company company = new Company();

    public static void main(String[] args) throws InterruptedException {
        startProgram(createCarsAndProperty());
    }

    public static List<Car> createCarsAndProperty() {
        Apartment apartment1 = new Apartment(75.00f, "Vilniaus g. 1, Vilnius", 3);
        Apartment apartment2 = new Apartment(100.00f, "Gedimino pr. 1, Vilnius", 4);

        Car mazdaCX5 = new Car("Mazda", "CX-5", 2016);
        Car mazda5 = new Car("Mazda", "5", 2007);
        Car bmwX5 = new Car("BMW", "X5", 2020);

        cars.add(mazdaCX5);
        cars.add(mazda5);
        cars.add(bmwX5);

        company.addProperty(apartment1);
        company.addProperty(apartment2);
        company.addProperty(mazdaCX5);
        company.addProperty(mazda5);
        company.addProperty(bmwX5);

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

    public static void showCars() {
        System.out.println("Automobiliai: ");
        for(Car c : cars) {
            System.out.println(c.getManufacturer() + " " + c.getModel());
        }
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
                    showCars();
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
                    NumbersSort.sortNumbers();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 5:
                    CharsSort.sortChars();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 6:
                    TextSort.sortStrings();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 7:
                    LinearDataStructures.simulateStack();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 8:
                    LinearDataStructures.simulateQueue();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 9:
                    LinearDataStructures.simulateList();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 10:
                    LinearDataStructures.simulateVector(cars);
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
                    break;
                case 11:
                    Company.addProperty();
                    printMenu();
                    break;
                case 12:
                    company.showPropertyDetails();
                    TimeUnit.SECONDS.sleep(3);
                    printMenu();
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
