import java.util.Scanner;

public class TextSort {

    public static Scanner scanner = new Scanner(System.in);

    public static String[] scanStrings() {
        String s;
        int numTotal;
        String[] arr;

        System.out.print("Iveskite norima ivesti zodziu kieki: ");
        numTotal = scanner.nextInt();
        scanner.nextLine();
        arr = new String[numTotal];

        for (int i = 0; i < arr.length; i++) {
            s = scanner.nextLine();
            arr[i] = s;
        }
        return arr;
    }

    public static void sortStrings(){
        String[] arr = scanStrings();
        int length = arr.length;
        String value;
        int index;

        for(int a = 1; a < length; a++){
            value = arr[a];
            index = a;
            while(index > 0 && arr[index-1].compareToIgnoreCase(value) > 0) {
                arr[index] = arr[index - 1];
                --index;
            }
            arr[index] = value;
        }

        System.out.print("Jusu surusiuoti ivesti zodziai: ");
        for (String s: arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
