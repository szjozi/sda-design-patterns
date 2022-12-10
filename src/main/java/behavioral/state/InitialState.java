package behavioral.state;

public class InitialState implements ParcelStatus{

    @Override
    public String toString() {
        return "INITIAL STATE";
    }

    @Override
    public void nextStatus(Parcel parcel) {
        parcel.setState(new Processing());
        System.out.println("Parcel status changed to 'PROCESSING'.");
    }
}
