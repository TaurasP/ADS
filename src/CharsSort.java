import java.util.*;

public class CharsSort {

    public static Scanner scanner = new Scanner(System.in);

    public static char[] scanChars() {
        char c;
        int numTotal;
        char[] charsArray;

        System.out.print("Iveskite norima ivesti simboliu kieki: ");
        numTotal = scanner.nextInt();
        charsArray = new char[numTotal];

        for (int i = 0; i < charsArray.length; i++) {
            c = scanner.next().charAt(0);
            charsArray[i] = c;
        }
        return charsArray;
    }

    public static void sortChars() {
        char[] arr = scanChars();
        Arrays.sort(arr);

        System.out.print("Jusu surusiuoti ivesti simboliai: ");
        for (char ch: arr){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}