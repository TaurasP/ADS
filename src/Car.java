import java.util.*;

public class Car {
    private final String manufacturer;
    private final String model;
    private int year;
    private String color;
    private int kilowatts;
    private String fuelType;
    private String transmissionType;
    private String driveWheels;
    private double fuelTankCapacity;

    public Car(String manufacturer, String model, int year, String color, int kilowatts, String fuelType,
               String transmissionType, String driveWheels, double fuelTankCapacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.kilowatts = kilowatts;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.driveWheels = driveWheels;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getKilowatts() {
        return kilowatts;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getDriveWheels() {
        return driveWheels;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] scanNumbers() {
        int num, numTotal;
        int[] numArray;

        System.out.print("Iveskite norima ivesti skaiciu kieki: ");
        numTotal = scanner.nextInt();
        scanner.nextLine();
        numArray = new int[numTotal];

        for (int i = 0; i < numArray.length; i++) {
            num = scanner.nextInt();
            numArray[i] = num;
        }
        return numArray;
    }

    public static void printNumbers(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int scanNumber() {
        int key;

        System.out.print("Iveskite ieskoma skaiciu: ");
        key = scanner.nextInt();

        return key;
    }

    public static String scanText() {
        String key;

        System.out.print("Iveskite ieskoma zodi: ");
        key = scanner.nextLine();

        return key;
    }

    public static void linearNumbersSearch() {
        int key;
        int[] arr;

        arr = scanNumbers();
        Arrays.sort(arr);
        printNumbers(arr);
        key = scanNumber();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Skaiciaus " + key + " indeksas: " + i + ".");
                return;
            }
        }
        System.out.println("Toks skaicius nerastas!");
    }

    public static void linearCarsSearch(List<Car> cars) {
        String key;

        key = scanText();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManufacturer().equalsIgnoreCase(key) || cars.get(i).getModel().equalsIgnoreCase(key)) {
                System.out.println("Rastas automobilis " + cars.get(i).getManufacturer() + " " + cars.get(i).getModel() + ", indeksas: " + i + ".");
                return;
            }
        }
        System.out.println("Toks elementas nerastas!");
    }

    public static void binaryNumbersSearch() {
        int first, mid, last, key;
        int[] arr;

        arr = scanNumbers();
        Arrays.sort(arr);
        printNumbers(arr);
        key = scanNumber();
        first = 0;
        last = arr.length - 1;
        mid = (first + last) / 2;

        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            } else if ( arr[mid] == key ){
                System.out.println("Skaiciaus " + key + " indeksas: " + mid + ".");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if ( first > last ){
            System.out.println("Toks skaicius nerastas!");
        }
    }

}
