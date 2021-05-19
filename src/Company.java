import java.util.*;
import java.util.concurrent.TimeUnit;

public class Company implements Property {
    public static final Scanner scanner = new Scanner(System.in);

    public static List<Property> propertyList = new ArrayList<>();

    @Override
    public void showPropertyDetails() {
        for(Property p : propertyList) {
            p.showPropertyDetails();
        }
    }

    public void addProperty(Property property) {
        propertyList.add(property);
    }

    public void removeProperty(Property property) {
        propertyList.remove(property);
    }

    public static void showPropertyMenu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pasirinkite norima isigyti nuosavybe: ");
        System.out.println("1. Automobilis.");
        System.out.println("2. Butas.");
        System.out.println("-----------------------------------------------------------");
        System.out.println("0. Grizti i pagrindini meniu.");
        System.out.println("-----------------------------------------------------------");
    }

    public static void addCar() {
        String inputManufacturer, inputModel;
        int inputYear;
        System.out.print("Iveskite automobilio gamintoja: ");
        inputManufacturer = scanner.nextLine();

        System.out.print("Iveskite automobilio modeli: ");
        inputModel = scanner.nextLine();

        System.out.print("Iveskite automobilio pagaminimo metus: ");
        inputYear = scanner.nextInt();
        scanner.nextLine();

        propertyList.add(new Car(inputManufacturer, inputModel, inputYear));
        System.out.println("Isigytas automobilis: " + inputManufacturer + " " + inputModel + ", " + inputYear + "m.");
    }

    public static void addApartment() {
        String inputAddress;
        float inputSquareMeters;
        int inputRoomsNumber;

        System.out.print("Iveskite buto adresa: ");
        inputAddress = scanner.nextLine();

        System.out.print("Iveskite buto plota kvadratiniais metrais (*galimi skaiciai po kablelio): ");
        inputSquareMeters = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Iveskite kambariu kieki bute: ");
        inputRoomsNumber = scanner.nextInt();
        scanner.nextLine();

        propertyList.add(new Apartment(inputSquareMeters, inputAddress, inputRoomsNumber));
        System.out.println("Isigytas butas: " + inputAddress + ", " + inputRoomsNumber + " kambariai, " +  inputSquareMeters + "m2.");
    }

    public static void addProperty() throws InterruptedException {
        showPropertyMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addCar();
                TimeUnit.SECONDS.sleep(2);
                addProperty();
                break;
            case 2:
                addApartment();
                TimeUnit.SECONDS.sleep(2);
                addProperty();
                break;
            case 0:
                break;
            default:
                System.out.println("\nTokio punkto nera.");
                TimeUnit.SECONDS.sleep(2);
                addProperty();
                break;
        }
    }
}

