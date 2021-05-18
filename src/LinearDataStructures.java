import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
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

        System.out.println("Stekas uzsipildys per " + numInStack + " sekundes. Prasome palaukti...");
        System.out.println("Stekas: " + arr);
        for (int i = 0; i < numInStack; i++) {
            LinearDataStructures.addToStack();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Stekas: " + arr);
        }
        /*TimeUnit.SECONDS.sleep(1);
        System.out.println("Uzpildyta eile: " + arr);*/
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Stekas atsilaisvins per " + numInStack + " sekundes. Prasome palaukti...");
        for (int i = 0; i < numInStack; i++) {
            LinearDataStructures.removeFromStack();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Stekas: " + arr);
        }
    }

    public static void simulateQueue() throws InterruptedException{
        Queue<String> people = new LinkedList<>(){};

        people.add("Jonas");
        people.add("Petras");
        people.add("Tomas");
        people.add("Marija");
        people.add("Linas");
        people.add("Monika");
        people.add("Rasa");

        System.out.println("Eileje 7 zmones: " + people);

        TimeUnit.SECONDS.sleep(1);

        for(String human : people){
            System.out.println("Aptarnautas: " + human);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Eile tuscia.");

    }

    public static void simulateList() {

    }

    public static void simulateVector() {

    }
}
