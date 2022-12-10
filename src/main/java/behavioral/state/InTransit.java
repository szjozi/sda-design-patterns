package behavioral.state;

public class InTransit implements ParcelStatus {

    @Override
    public String toString() {
        return "IN TRANSIT";
    }

    @Override
    public void nextStatus(Parcel parcel) {
        parcel.setState(new Delivered());
        System.out.println("Parcel status changed to 'DELIVERED'.");
    }
}
