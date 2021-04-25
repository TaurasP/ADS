import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class LinearDataStructures {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Stack<String> arr = new Stack<>();

    public static void addToStack() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        arr.add(sdf.format(timestamp));
    }

    public static void removeFromStack() {
        arr.pop();
    }

    public static void simulateStack() throws InterruptedException {
        int numInStack = 5;
        int removeFromStack = 3;

        System.out.println("Eile uzsipildys per " + numInStack + " sekundes. Prasome palaukti.");
        for (int i = 0; i < numInStack; i++) {
            LinearDataStructures.addToStack();
            TimeUnit.SECONDS.sleep(1);
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Uzpildyta eile: " + arr);
        TimeUnit.SECONDS.sleep(1);

        System.out.print("Eile sumazejo");
        for (int i = 0; i < removeFromStack; i++) {
            TimeUnit.SECONDS.sleep(1);
            LinearDataStructures.removeFromStack();
        }
        System.out.println(": " + arr);
    }
}
