import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
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

    public static void simulateQueue() throws InterruptedException {
        Queue<String> people = new LinkedList<>();

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
        System.out.println("Eileje zmoniu nebera.");

    }

    public static void simulateList() throws InterruptedException {
        List<String> playlist = new LinkedList<>();
        playlist.add("Renegades - X Ambassadors");
        playlist.add("Pharell Williams - Freedom");
        playlist.add("DNCE - Cake By The Ocean");
        playlist.add("Imagine Dragons - Believer");
        playlist.add("Nick Jonas - Find You");
        playlist.add("Imagine Dragons - Bad Liar");
        playlist.add("Dua Lipa - Physical");

        System.out.println("Grojarastis: " + playlist);
        TimeUnit.SECONDS.sleep(1);

        for(String song : playlist) {
            System.out.println("Grojama daina: " + song);
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("Isklausytos visos grojarastyje esancios dainos.");
    }

    public static void simulateVector(List<Car> carsList) throws InterruptedException {
        Vector<String> carsVector = new Vector<>();

        for (int i = 0; i < carsList.size(); i++) {
            carsVector.add(carsList.get(i).getManufacturer() + " " + carsList.get(i).getModel());
        }

        System.out.println("Automobiliai: " + carsVector);
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Parduota: Mazda 5");
        carsVector.remove(1);
        System.out.println("Automobiliai: " + carsVector);
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Nupirkta: Audi Q5");
        carsVector.add("Audi Q5");
        System.out.println("Automobiliai: " + carsVector);
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Parduoti: Mazda CX-5, BMW X5");
        carsVector.remove(0);
        carsVector.remove(1);
        System.out.println("Automobiliai: " + carsVector);
        TimeUnit.SECONDS.sleep(2);
    }
}
