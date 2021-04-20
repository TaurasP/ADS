import java.util.List;
import java.util.Scanner;

public class Search {

    public static Scanner scanner = new Scanner(System.in);
    public static int[] numArray = {};

    public static void addNumbers() {
        int inputNum, inputNumTotal;

        System.out.print("Iveskite norima ivesti skaiciu kieki: ");
        inputNumTotal = scanner.nextInt();
        numArray = new int[inputNumTotal];
        for (int i = 0; i < numArray.length; i++) {
            inputNum = scanner.nextInt();
            numArray[i] = inputNum;
        }
    }

    public static void linearSearch() {
        System.out.print("Iveskite ieskoma skaiciu: ");
        int inputKey = scanner.nextInt();
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == inputKey) {
                System.out.println("Skaicius " + inputKey + " rastas pozicijoje " + i + ".\n");
                break;
            } else {
                System.out.println("Tokio skaiciaus nera.\n");
                break;
            }
        }

    }


}
