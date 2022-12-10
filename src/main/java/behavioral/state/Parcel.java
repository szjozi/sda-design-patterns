package behavioral.state;

public class Parcel {

    private ParcelStatus state;

    public Parcel() {
        state = new InitialState();
    }

    public void nextState() {
        System.out.println("Next state method invoked");
        state.nextStatus(this);
    }

    public ParcelStatus getState() {
        System.out.println("Current state: " + state);
        return state;
    }

    public void setState(ParcelStatus packageState) {
        state = packageState;
    }
}
