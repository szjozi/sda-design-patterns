package behavioral.state;

public class Shipped implements ParcelStatus {

    @Override
    public String toString() {
        return "SHIPPED";
    }

    @Override
    public void nextStatus(Parcel parcel) {
        parcel.setState(new InTransit());
        System.out.println("Parcel status changed to 'IN TRANSIT'.");
    }
}
