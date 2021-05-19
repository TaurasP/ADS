public class Apartment implements Property{
    float squareMeters;
    String address;
    int roomsNumber;

    public float getSquareMeters() {
        return squareMeters;
    }

    public String getAddress() {
        return address;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public Apartment(float squareMeters, String address, int roomsNumber) {
        this.squareMeters = squareMeters;
        this.address = address;
        this.roomsNumber = roomsNumber;
    }

    @Override
    public void showPropertyDetails() {
        System.out.println("Butas: " + address + ", " + roomsNumber + " kambariai, " + squareMeters + "m2.");
    }
}
