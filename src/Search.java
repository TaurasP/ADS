import java.util.Scanner;
import java.util.Arrays;

public class Search {

    public static Scanner scanner = new Scanner(System.in);
    //public static int[] numArray = {};

    public static int[] scanNumbers() {
        int num, numTotal;
        int[] numArray;

        System.out.print("Iveskite norima ivesti skaiciu kieki: ");
        numTotal = scanner.nextInt();
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

    public static void linearSearch() {
        int key;
        int[] arr;

        arr = scanNumbers();
        Arrays.sort(arr);
        printNumbers(arr);
        key = scanNumber();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Skaiciaus " + key + " pozicija yra " + i + ".\n");
                return;
            }
        }
        System.out.println("Toks skaicius nerastas!\n");
    }

    public static void binarySearch() {
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
                System.out.println("Skaiciaus " + key + " pozicija yra " + mid + ".\n");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if ( first > last ){
            System.out.println("Toks skaicius nerastas!\n");
        }
    }

}
