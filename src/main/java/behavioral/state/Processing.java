package behavioral.state;

public class Processing implements ParcelStatus {

    @Override
    public String toString() {
        return "PROCESSING";
    }

    @Override
    public void nextStatus(Parcel parcel) {
        parcel.setState(new Shipped());
        System.out.println("Parcel status changed to 'SHIPPED'.");
    }
}
