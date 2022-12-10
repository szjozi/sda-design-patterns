package structural.adapter;


public class MphSpeedAdapter implements SpeedAdapter {

    private static final double KILOMETERS_TO_MILES = 0.621371192;

    private final Movable movable;

    protected MphSpeedAdapter(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getMphSpeed() {
        return movable.getKmSpeed() * KILOMETERS_TO_MILES;
    }
}
