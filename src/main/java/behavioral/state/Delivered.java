package behavioral.state;

public class Delivered implements ParcelStatus {

    @Override
    public String toString() {
        return "DELIVERED";
    }

    @Override
    public void nextStatus(Parcel parcel) {
        System.out.println("Parcel delivered to Customer - status unchanged.");
    }
}
